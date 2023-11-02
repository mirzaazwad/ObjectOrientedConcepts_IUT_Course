package Lab6.ORM;

import Lab6.Driver.DriverStrategy;
import Lab6.Model.Hibernate;
import Lab6.Model.IModel;
import Lab6.Model.ModelStrategy;

public class MySQLDatabase implements ISQLModel{
    private String databaseName;
    private DriverStrategy driver;
    public MySQLDatabase(String databaseName,DriverStrategy driver){
        this.databaseName=databaseName;
        this.driver=driver;
        System.out.println(this.initDatabase());
    }

    public String initDatabase(){
        return this.driver.executeStrategy()+String.format(" time: %f",driver.getRuntime());
    }

    public String executeQuery(ModelStrategy model, String query, String... args){
        if(query.equals("findOne")){
            return "mysql: "+model.findOne()+"  LIMIT 1";
        }
        else if(query.equals("findMany")){
            return "mysql: "+model.findMany();
        }
        else if(query.equals("insertOne")){
            return "mysql: "+model.insertOne(args);
        }
        else{
            return "mysql: "+"Invalid Query";
        }
    }


}
