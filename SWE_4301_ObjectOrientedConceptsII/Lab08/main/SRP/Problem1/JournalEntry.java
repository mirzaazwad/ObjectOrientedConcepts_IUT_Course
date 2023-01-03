package Lab08.SRP.Problem1;

import java.util.ArrayList;

public class JournalEntry {
    public ArrayList<String> entries;

    public void addEntries(ArrayList<String>strings){
        for(String i:strings){
            entries.add(i);
        }
    }

    public void addEntry(String string){
        entries.add(string);
    }



    public void removeEntry(String value){
        int removeIx=-1;
        for(int i=0;i<this.entries.size();i++){
            if(entries.get(i).equals(value)){
                removeIx=i;
                break;
            }
        }
        entries.remove(removeIx);
    }

    @Override
    public String toString(){
        String output="";
        for(String i:entries){
            output=output+i+" ";
        }
        return output;
    }

}
