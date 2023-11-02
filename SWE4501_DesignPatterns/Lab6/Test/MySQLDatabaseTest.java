package Lab6;
import Lab6.Driver.*;
import Lab6.Model.Hibernate;
import Lab6.Model.IModel;
import Lab6.Model.ModelStrategy;
import org.junit.jupiter.api.BeforeEach;
import Lab6.ORM.MySQLDatabase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MySQLDatabaseTest {
    private MySQLDatabase mySQLDatabase;
    private ModelStrategy model;

    @BeforeEach
    public void setUp() {
        mySQLDatabase = new MySQLDatabase("test_database", new DriverStrategy(new JDBC("mysql","localhost",2433))); // Provide an actual driver strategy
        model = new ModelStrategy(new Hibernate("test_table",mySQLDatabase));
    }

    @Test
    public void init(){
        assertEquals("Established JDBC Connection at mysql@localhost:2433 time: 0.280000",mySQLDatabase.initDatabase());
    }

    @Test
    public void ApplyJRO(){
        IDriver driver=new JDBC("mysql","localhost",2433);
        driver=new JRO(driver);
        assertEquals("0.22400000000000003",driver.getRuntime().toString());
        assertEquals("Java Runtime Optimizer applied, Established JDBC Connection at mysql@localhost:2433",driver.initializeDriver());
    }

    @Test
    public void ApplyDBO(){
        IDriver driver=new JDBC("mysql","localhost",2433);
        driver=new DBQO(driver);
        assertEquals("0.25200000000000006",driver.getRuntime().toString());
        assertEquals("Database Optimizer applied, Established JDBC Connection at mysql@localhost:2433",driver.initializeDriver());
    }

    @Test
    public void ApplyDBO_JRO(){
        IDriver driver=new JDBC("mysql","localhost",2433);
        driver=new DBQO(driver);
        driver=new JRO(driver);
        assertEquals("0.20160000000000006",driver.getRuntime().toString());
        assertEquals("Java Runtime Optimizer applied, Database Optimizer applied, Established JDBC Connection at mysql@localhost:2433",driver.initializeDriver());
    }

    @Test
    public void testExecuteQueryFind() {
        String queryResult = mySQLDatabase.executeQuery(model, "findMany");
        assertEquals("mysql: hibernate: SELECT * FROM test_table", queryResult);
    }

    @Test
    public void testExecuteQueryFindOne() {
        String queryResult = mySQLDatabase.executeQuery(model, "findOne");
        assertEquals("mysql: hibernate: SELECT * FROM test_table  LIMIT 1", queryResult);
    }

    @Test
    public void testExecuteQueryInsert() {
        String queryResult = mySQLDatabase.executeQuery(model, "insertOne", "value1", "value2");
        assertEquals("mysql: hibernate: INSERT INTO test_table VALUES(value1,value2)", queryResult); // Adjust the expected value accordingly
    }

}
