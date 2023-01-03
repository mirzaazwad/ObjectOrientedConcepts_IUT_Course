package Lab06.GenericCount;

public class LengthGreaterThan3 implements IProperty<String>{
    public boolean CheckProperty(String str){
        if(str.length()>3){
            return true;
        }
        else{
            return false;
        }
    }
}
