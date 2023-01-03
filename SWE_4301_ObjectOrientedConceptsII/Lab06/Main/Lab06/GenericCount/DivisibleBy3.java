package Lab06.GenericCount;

public class DivisibleBy3 implements IProperty<Integer> {
    public boolean CheckProperty(Integer num){
        if(num%3==0){
            return true;
        }
        else{
            return false;
        }
    }
}

