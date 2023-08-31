package Lab3.Singleton;

public class Database {
    private static Database instance;
    public String DBUser;
    private String connection;

    private Database() {
        initialize();
    }

    public static synchronized Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    private void initialize() {
        this.connection = "Connected to the database";
    }

    public String getConnection(){
        return this.connection;
    }

    public String query(String sql) {
        return "Executing query: " + sql;
    }
}
