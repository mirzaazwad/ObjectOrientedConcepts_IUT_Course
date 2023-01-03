package SOLID;

public class KidsBook extends Book{
    public KidsBook(String title,String author){
        super(title,author);
    }

    public double rentChange(){
        return 0.90;
    }
}
