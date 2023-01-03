package Task03;

public class LengthException  extends Exception{
    @Override
    public String getMessage(){
        return "Length is not 8";
    }
}


