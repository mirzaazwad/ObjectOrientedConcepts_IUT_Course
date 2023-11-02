package Lab6.ORM;

import Lab6.Driver.DriverStrategy;
import Lab6.Model.Hibernate;
import Lab6.Model.IModel;
import Lab6.Model.ModelStrategy;

public class PostgresSQLDatabase implements ISQLModel{
    private String databaseName;
    private DriverStrategy driver;
    public PostgresSQLDatabase(String databaseName,DriverStrategy driver){
        this.databaseName=databaseName;
        this.driver=driver;
        System.out.println(driver.executeStrategy());
        System.out.println(driver.getRuntime());
    }

    public String initDatabase(){
        return this.driver.executeStrategy()+String.format(" time: %f",driver.getRuntime());
    }

    public String executeQuery(ModelStrategy model, String query, String... args){
        if(query.equals("findOne")){
            return "psql: "+model.findOne()+"  LIMIT 1";
        }
        else if(query.equals("insertOne")){
            return "psql: "+model.insertOne(args);
        }
        else if(query.equals(("findMany"))){
            return "psql: "+ model.findMany();
        }
        else{
            return "psql: "+"Invalid Query";
        }
    }
}
