package Lab6;
import Lab6.Driver.*;
import Lab6.Model.Hibernate;
import Lab6.Model.IModel;
import Lab6.Model.ModelStrategy;
import Lab6.ORM.OracleSQLDatabase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OracleSQLDatabaseTest {
    private OracleSQLDatabase oracleSQLDatabase;
    private ModelStrategy model;

    @BeforeEach
    public void setUp() {
        IDriver driver=new JDBC("mysql","localhost",2433);
        driver=new JRO(driver);
        oracleSQLDatabase = new OracleSQLDatabase("test_database", new DriverStrategy(driver)); // Provide an actual driver strategy
        model = new ModelStrategy(new Hibernate("test_table",oracleSQLDatabase));
    }

    @Test
    public void init(){
        assertEquals("Java Runtime Optimizer applied, Established JDBC Connection at mysql@localhost:2433 time: 0.224000",oracleSQLDatabase.initDatabase());
    }

    @Test
    public void testExecuteQueryFind() {
        String queryResult = oracleSQLDatabase.executeQuery(model, "findMany");
        assertEquals("oracle: hibernate: SELECT * FROM test_table", queryResult);
    }

    @Test
    public void testExecuteQueryFindOne() {
        String queryResult = oracleSQLDatabase.executeQuery(model, "findOne");
        assertEquals("oracle: hibernate: SELECT * FROM test_table  WHERE ROWNUM=1", queryResult);
    }

    @Test
    public void testExecuteQueryInsert() {
        String queryResult = oracleSQLDatabase.executeQuery(model, "insertOne", "value1", "value2");
        assertEquals("oracle: hibernate: INSERT INTO test_table VALUES(value1,value2)", queryResult); // Adjust the expected value accordingly
    }
}
