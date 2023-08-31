package Lab3;
import Lab3.Singleton.Database;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Lab3TestSingleton {
    private static Database database;
    @BeforeAll
    public static void initDatabase(){
        database=database.getInstance();
    }
    @Test
    public void testDatabaseConnection(){
        assertEquals("Connected to the database",database.getConnection());
    }

    @Test
    public void testDatabaseQuery(){
        assertEquals("Executing query: SELECT * FROM STUDENTS;",database.query("SELECT * FROM STUDENTS;"));
    }

    @Test
    public void testNoNewConstruction(){
        database.DBUser="Mirza";
        Database anotherDatabase=Database.getInstance();
        assertEquals("Mirza",anotherDatabase.DBUser);
    }

}
