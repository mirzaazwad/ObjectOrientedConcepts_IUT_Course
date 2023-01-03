package SOLID;

public class NewBook extends Book{
    public NewBook(String title,String author){
        super(title,author);
    }

    public double rentChange(){
        return 1.30;
    }
}
