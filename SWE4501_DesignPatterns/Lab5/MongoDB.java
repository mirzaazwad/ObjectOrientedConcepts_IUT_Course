package Lab5;

public class MongoDB implements NoSQLModel {
    public String establish_connection(){
        return  "MongoDB Atlas connected";
    }
    public String runQuery(String objectQuery){
        return objectQuery ;
    }

    public String close_connection(){
        return "MongoDB Atlas Disconnected" ;
    }
}
