package Lab6.ORM;

import Lab6.Driver.DriverStrategy;
import Lab6.Driver.JDBC;
import Lab6.Driver.ODBC;

public class DatabaseFactory {
    private ISQLModel dbType;
    public DatabaseFactory(String dbType,String databaseName){
        if(dbType.equals("mysql")){
            this.dbType=new MySQLDatabase(databaseName,new DriverStrategy(new JDBC("mysql-client","localhost",5433)));
        }
        else if(dbType.equals("oracle")){
            this.dbType=new OracleSQLDatabase(databaseName,new DriverStrategy(new JDBC("mysql-client","localhost",1298)));
        }
        else{
            this.dbType=new PostgresSQLDatabase(databaseName,new DriverStrategy(new ODBC("psql-client","localhost",2432)));
        }
    }
}
