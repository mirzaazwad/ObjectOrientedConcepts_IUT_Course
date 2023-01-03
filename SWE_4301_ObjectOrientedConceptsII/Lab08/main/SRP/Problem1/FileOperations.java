package Lab08.SRP.Problem1;

import java.util.ArrayList;
import java.util.HashMap;

public class FileOperations {
    public HashMap<String,ArrayList<String>>storage;

    public void save(String ID, String Entry){
        ArrayList<String>array=storage.get(ID);
        array.add(Entry);
        storage.replace(ID,array);
    }

    public void save(String ID, ArrayList<String> Entry){
        ArrayList<String>array=storage.get(ID);
        for(String i:Entry){
            array.add(i);
        }
        storage.replace(ID,array);
    }

    public ArrayList<String> load(String ID){
        return storage.get(ID);
    }



}
