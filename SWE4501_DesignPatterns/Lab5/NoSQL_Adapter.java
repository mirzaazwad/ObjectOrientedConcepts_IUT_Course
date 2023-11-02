package Lab5;


public class NoSQL_Adapter implements ORM {
    private NoSQLModel noSQL;

    public NoSQL_Adapter(NoSQLModel noSQL){
        this.noSQL=noSQL;
    }
    public String connect(){
        return noSQL.establish_connection();
    }
    public String executeQuery(String queryString){
         return noSQL.runQuery(queryString);
    }

    public String disconnect(){
        return noSQL.close_connection();
    }

}
