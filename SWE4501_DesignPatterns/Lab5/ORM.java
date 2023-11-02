package Lab5;

public interface ORM {
    String connect();
    String executeQuery(String queryString);

    String disconnect();
}
