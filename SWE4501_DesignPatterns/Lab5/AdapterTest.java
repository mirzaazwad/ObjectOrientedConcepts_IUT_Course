package Lab5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class AdapterTest {
    @Test
    public void TestMySQL(){
        ORM mySQL=new MySQL();
        assertEquals(mySQL.connect(),"Connected to mySQL");
        assertEquals(mySQL.executeQuery("SELECT * FROM Students"),"mysql: SELECT * FROM Students");
        assertEquals(mySQL.disconnect(),"mysql: Disconnected from mySQL");
    }

    @Test
    public void TestPostgreSQL(){
        ORM psql=new PostgreSQL();
        assertEquals(psql.connect(),"Connected to postgreSQL");
        assertEquals(psql.executeQuery("SELECT * FROM Students"),"psql: SELECT * FROM Students");
        assertEquals(psql.disconnect(),"Disconnected from postgreSQL");
    }

    @Test
    public void TestMongoDB(){
        ORM mongoDB=new NoSQL_Adapter(new MongoDB());
        assertEquals(mongoDB.connect(),"MongoDB Atlas connected");
        assertEquals(mongoDB.executeQuery("db.find(students)"),"db.find(students)");
        assertEquals(mongoDB.disconnect(),"MongoDB Atlas Disconnected");
    }

    @Test
    public void TestRedisCloud(){
        ORM mongoDB=new NoSQL_Adapter(new Redis());
        assertEquals(mongoDB.connect(),"Redis Cloud connected");
        assertEquals(mongoDB.executeQuery("db.find(students)"),"db.find(students)");
        assertEquals(mongoDB.disconnect(),"Redis Cloud Disconnected");
    }
}
