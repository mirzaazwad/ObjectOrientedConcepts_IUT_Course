package Lab6.ORM;

import Lab6.Driver.DriverStrategy;
import Lab6.Model.IModel;
import Lab6.Model.ModelStrategy;

public class OracleSQLDatabase implements ISQLModel{
    private String databaseName;
    private DriverStrategy driver;
    public OracleSQLDatabase(String databaseName,DriverStrategy driver){
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
            return "oracle: "+model.findOne()+"  WHERE ROWNUM=1";
        }
        else if(query.equals("insertOne")){
            return "oracle: "+model.insertOne(args);
        }
        else if(query.equals(("findMany"))){
            return "oracle: "+ model.findMany();
        }
        else{
            return "oracle: "+"Invalid Query";
        }
    }
}
