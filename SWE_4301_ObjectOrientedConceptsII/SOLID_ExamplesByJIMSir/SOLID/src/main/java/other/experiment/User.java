package other.experiment;

/**
 * Created by jubair.
 * Date: 23/9/22
 * Time: 7:28 AM
 */

public class User {
    MySQLDatabase database;

    public User(MySQLDatabase database){
        this.database = database;
    }

    public Boolean store(String user){
        return database.save(user);
    }

    public User get(String id){
        return database.get(id);
    }
}
