package assignment2.DataCoupling;

public class Book {
    public int available;
    public String book_name;
    public Book(String book_name,int available){
        this.book_name=book_name;
        this.available=available;
    }

    public void reserveBook(){
        this.available--;
    }

    public boolean isAvailable(){
        return this.available==0?false:true;
    }

}
