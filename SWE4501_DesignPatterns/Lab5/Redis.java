package Lab5;

public class Redis implements NoSQLModel {
    public String establish_connection(){
        return "Redis Cloud connected";
    }
    public String runQuery(String objectQuery){
        return objectQuery;
    }

    public String close_connection(){
        return "Redis Cloud Disconnected";
    }
}
