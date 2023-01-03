import SOLID.KidsBook;
import SOLID.NewBook;
import SOLID.RegularBook;
import SOLID.RentBook;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSolid {
    @Test
    public void TestKidsBookWithoutFine(){
        KidsBook kidsBook=new KidsBook("Famous Five","Enid Blyton");
        RentBook rentBook=new RentBook(kidsBook,7,20.00);
        assertEquals(18.00,rentBook.CalculateRent());
    }

    @Test
    public void TestRegularBookWithoutFine(){
        RegularBook regularBook=new RegularBook("Farewell to Arms","Ernest Hemingway");
        RentBook rentBook=new RentBook(regularBook,7,20.00);
        assertEquals(16.00,rentBook.CalculateRent());
    }

    @Test
    public void TestNewBookWithoutFine(){
        NewBook newBook=new NewBook("Anarchy","Shashi Tharoor");
        RentBook rentBook=new RentBook(newBook,7,20.00);
        assertEquals(26.00,rentBook.CalculateRent());
    }

    @Test
    public void TestKidsBookWithFine(){
        KidsBook kidsBook=new KidsBook("Famous Five","Enid Blyton");
        RentBook rentBook=new RentBook(kidsBook,8,20.00);
        assertEquals(22.00,rentBook.CalculateRent());
    }

    @Test
    public void TestRegularBookWithFine(){
        RegularBook regularBook=new RegularBook("Farewell to Arms","Ernest Hemingway");
        RentBook rentBook=new RentBook(regularBook,8,20.00);
        assertEquals(20.00,rentBook.CalculateRent());
    }

    @Test
    public void TestNewBookWithFine(){
        NewBook newBook=new NewBook("Anarchy","Shashi Tharoor");
        RentBook rentBook=new RentBook(newBook,8,20.00);
        assertEquals(30.00,rentBook.CalculateRent());
    }
}
