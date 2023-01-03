package assignment2.DataCoupling;

import java.util.HashMap;
import java.util.Map;

public class Student {
    public Map<String,Integer> reservedBooks;
    public String studentName;
    public Student(String studentName){
        this.studentName=studentName;
        this.reservedBooks= new HashMap<String,Integer>();
    }

    public boolean checkBookAvailable(Librarian librarian, String book_name){
        return librarian.isBookAvailable(book_name);
    }

    public boolean reserveBook(Librarian librarian, String book_name){
        boolean isReserved=librarian.reserveBook(book_name);
        if(isReserved){
            this.reservedBooks.put(book_name,this.reservedBooks.get(book_name)+1);
            return true;
        }
        return false;
    }

}
