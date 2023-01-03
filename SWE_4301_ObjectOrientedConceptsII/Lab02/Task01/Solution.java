package Task01;
import java.util.*;

public class Solution {
    enum ERROR_CODES{

        C_400("Bad Request"),C_401("Unauthorized"),C_403("Forbidden"),C_404("Not Found"),C_408("Request Timeout");

        private String Message;
        ERROR_CODES(String Message){
            this.Message=Message;
        }

        public String getMessage(){
            return this.Message;
        }

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ERROR_CODES codes=ERROR_CODES.valueOf(sc.nextLine());
        System.out.println(codes.getMessage());
    }
}
