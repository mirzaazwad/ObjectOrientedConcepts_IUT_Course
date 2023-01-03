package assignment2.DataCoupling;

import java.util.List;

public class Librarian {
    public List<Book> bookList;
    public String librarianName;
    public Librarian(String librarianName,List<Book>bookList){
        this.bookList=bookList;
        this.librarianName=librarianName;
    }

    public boolean isBookAvailable(String book_name){
        for(Book books:bookList){
            if(books.book_name.equals(book_name)){
                return books.isAvailable();
            }
        }
        return false;
    }

    public boolean reserveBook(String book_name){
        for(Book books:bookList){
            if(books.book_name.equals(book_name)){
                 if(books.isAvailable()){
                     books.available--;
                     return true;
                 }
            }
        }
        return false;
    }
}
