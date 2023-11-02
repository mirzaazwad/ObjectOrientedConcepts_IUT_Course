package Lab6;
import Lab6.Driver.*;
import Lab6.Model.Eloquent;
import Lab6.Model.IModel;
import Lab6.Model.ModelStrategy;
import Lab6.ORM.PostgresSQLDatabase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostgresSQLDatabaseTest {
    private PostgresSQLDatabase psqlDatabase;
    private ModelStrategy model;

    @BeforeEach
    public void setUp() {
        IDriver driver=new DBQO(new ODBC("psql","localhost",2433));
        driver=new JRO(driver);
        psqlDatabase = new PostgresSQLDatabase("test_database", new DriverStrategy(driver)); // Provide an actual driver strategy
        model = new ModelStrategy(new Eloquent("test_table",psqlDatabase));
    }

    @Test
    public void init(){
        assertEquals("Java Runtime Optimizer applied, Database Optimizer applied, Established ODBC Connection at psql@localhost:2433 time: 0.223200",psqlDatabase.initDatabase());
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
        String queryResult = psqlDatabase.executeQuery(model, "findMany");
        assertEquals("psql: eloquent: SELECT * FROM test_table", queryResult);
    }

    @Test
    public void testExecuteQueryFindOne() {
        String queryResult = psqlDatabase.executeQuery(model, "findOne");
        assertEquals("psql: eloquent: SELECT * FROM test_table  LIMIT 1", queryResult);
    }

    @Test
    public void testExecuteQueryInsert() {
        String queryResult = psqlDatabase.executeQuery(model, "insertOne", "value1", "value2");
        assertEquals("psql: eloquent: INSERT INTO test_table VALUES(value1,value2)", queryResult); // Adjust the expected value accordingly
    }

}
