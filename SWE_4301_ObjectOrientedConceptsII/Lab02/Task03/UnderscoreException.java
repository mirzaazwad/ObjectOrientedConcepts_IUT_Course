package Task03;

public class UnderscoreException extends Exception{
    @Override
    public String getMessage(){
        return "Underscore Not Found";
    }
}