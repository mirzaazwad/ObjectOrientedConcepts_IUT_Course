package Lab06.GenericCount;

public class OddNumber implements IProperty<Integer> {
    public boolean CheckProperty(Integer num){
        if(num%2==0){
            return false;
        }
        else{
            return true;
        }
    }
}
