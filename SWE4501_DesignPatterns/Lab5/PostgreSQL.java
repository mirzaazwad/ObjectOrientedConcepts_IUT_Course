package Lab5;

public class PostgreSQL implements ORM {
        public String connect(){
                return "Connected to postgreSQL";
        }
        public String executeQuery(String queryString){
                return "psql: "+queryString;
        }

        public String disconnect(){
                return "Disconnected from postgreSQL";
        }
}
