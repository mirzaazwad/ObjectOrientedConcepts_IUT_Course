package Lab6.Model;

import Lab6.ORM.ISQLModel;

public class Eloquent implements IModel{
    private String tableName;
    private ISQLModel database;
    public Eloquent(String tableName,ISQLModel database){
        this.tableName=tableName;
        this.database=database;
    }

    public String find(){
        return String.format("eloquent: SELECT * FROM %s",this.tableName);
    }

    public String findOne(){
        return String.format("eloquent: SELECT * FROM %s",this.tableName);
    }

    public String insert(String... args){
        return String.format("eloquent: INSERT INTO %s VALUES(%s)",this.tableName,String.join(",",args));
    }
}
