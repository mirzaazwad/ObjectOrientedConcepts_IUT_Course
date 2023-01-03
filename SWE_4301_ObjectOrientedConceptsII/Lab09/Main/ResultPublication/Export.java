package Lab09.ResultPublication;

import Lab09.StudentCollection.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public abstract class Export{
    protected File file;
    protected String filename;

    protected Export(String filename){
        this.filename=filename;
        this.file=new File(filename);
    }
    public boolean CreateFile() throws IOException {
        if(this.file.createNewFile()){
            return true;
        }
        else{
            if(this.file.delete()){
                return true;
            }
            return false;
        }
    }

    public abstract void export(List<Student>list)throws IOException;

    public String readExportedFile(){
        String output="";
        try {
            Scanner myReader = new Scanner(this.file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                output=output+data+"\n";
            }
            myReader.close();
            return output;
        } catch (FileNotFoundException e) {
            return e.getMessage();
        }
    }
}
