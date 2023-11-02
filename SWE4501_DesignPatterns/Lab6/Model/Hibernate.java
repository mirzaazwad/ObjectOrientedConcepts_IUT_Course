package Lab6.Model;

import Lab6.ORM.ISQLModel;

public class Hibernate implements IModel{
    private String tableName;
    private ISQLModel database;
    public Hibernate(String tableName,ISQLModel database){
        this.tableName=tableName;
        this.database=database;
    }

    public String find(){
        return String.format("hibernate: SELECT * FROM %s",this.tableName);
    }

    public String findOne(){
        return String.format("hibernate: SELECT * FROM %s",this.tableName);
    }

    public String insert(String... args){
        return String.format("hibernate: INSERT INTO %s VALUES(%s)",this.tableName,String.join(",",args));
    }

}