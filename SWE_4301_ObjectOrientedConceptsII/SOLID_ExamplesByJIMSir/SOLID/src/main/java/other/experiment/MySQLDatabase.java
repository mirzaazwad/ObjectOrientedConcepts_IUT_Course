package other.experiment;

/**
 * Created by jubair.
 * Date: 23/9/22
 * Time: 7:29 AM
 */

public class MySQLDatabase {
    public boolean save(String value){
        // own way to save data.
        System.out.println("MySQL saving " + value);
        return true;
    }

    public User get(String id) {
        return null;
    }
}
