package Lab5;

public interface NoSQLModel {
    String establish_connection();
    String runQuery(String objectQuery);

    String close_connection();
}
