package Lab5;

public class MySQL implements ORM {
    public String connect(){
        return "Connected to mySQL"; 
    }
    public String executeQuery(String queryString){
        return "mysql: "+queryString; 
    }

    public String disconnect(){
        return "mysql: Disconnected from mySQL"; 
    }
}
