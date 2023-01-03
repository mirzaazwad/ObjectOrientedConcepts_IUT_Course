package Lab06.GenericCount;

import java.util.ArrayList;

public class Algorithm {
    public Algorithm(){

    }

    public<T> int countif(ArrayList<T> value,IProperty property){
        int count=0;
        for(T elem:value){
            if(property.CheckProperty(elem)){
                count++;
            }
        }
        return count;
    }

}
