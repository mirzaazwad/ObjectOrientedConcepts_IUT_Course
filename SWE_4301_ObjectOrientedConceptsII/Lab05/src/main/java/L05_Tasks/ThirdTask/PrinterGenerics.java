package L05_Tasks.ThirdTask;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PrinterGenerics<T> {

    private ArrayList<T>array;
    public PrinterGenerics(){
        array=new ArrayList<T>();
    }

    public void addElem(T value){
        array.add(value);
    }

    public ArrayList<String> printList(ArrayList<T> list){
        for(int i=0;i<list.size();i++){
            addElem(list.get(i));
        }
        ArrayList<String>output=new ArrayList<String>();
        for(int i=0;i< array.size();i++){
            output.add(array.get(i).toString());
        }
        return output;
    }

}
