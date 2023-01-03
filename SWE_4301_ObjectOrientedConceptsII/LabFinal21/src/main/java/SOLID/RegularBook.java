package SOLID;

public class RegularBook extends Book{
    public RegularBook(String title,String author){
        super(title,author);
    }
    public double rentChange(){
        return 0.80;
    }
}
