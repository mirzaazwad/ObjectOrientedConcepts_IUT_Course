package DIP.example2.problem;

import org.junit.jupiter.api.Test;
import other.experiment.MySQLDatabase;
import other.experiment.User;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jubair.
 * Date: 23/9/22
 * Time: 7:31 AM
 */

class UserTest {

    @Test
    void store() {
        MySQLDatabase database = new MySQLDatabase();
        User user = new User(database);
        User user1= new User(database);
        Boolean saved = user.store("Jubair");
        saved = user1.store("Jubair");
        assertTrue(saved);
    }

    @Test
    void storeSomethingElse() {
        MySQLDatabase database = new MySQLDatabase();
        User user = new User(database);
        User newUser = user.get("Jubair");
    }
}