package Task02;
import java.util.*;

public class Directions {

    public DIRECTIONS currentDirection;
    public enum DIRECTIONS{

        NORTH("Go South"){
            String getCurrentPosition(){
                return "I am in "+String.valueOf(this);
            }

            String NextMove(){
                return "I have to "+this.getMessage();
            }


        },South("Go North"){
            String getCurrentPosition(){
                return "I am in "+String.valueOf(this);
            }

            String NextMove(){
                return "I have to "+this.getMessage();
            }
        },WEST("Go East"){
            String getCurrentPosition(){
                return "I am in "+String.valueOf(this);
            }

            String NextMove(){
                return "I have to "+this.getMessage();
            }
        },EAST("Go West"){
            String getCurrentPosition(){
                return "I am in "+String.valueOf(this);
            }

            String NextMove(){
                return "I have to "+this.getMessage();
            }
        };

        private String Message;
        DIRECTIONS(String Message){
            this.Message=Message;
        }

        public String getMessage(){
            return this.Message;
        }

        abstract String getCurrentPosition();
        abstract String NextMove();
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        DIRECTIONS dir=DIRECTIONS.valueOf(sc.nextLine());
        System.out.println(dir.getCurrentPosition());
        System.out.println(dir.NextMove());

    }




}