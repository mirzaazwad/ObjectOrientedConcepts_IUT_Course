package Lab08.ISP.Problem1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Problem1Test {
    @Test
    public void TestPrintBasic(){
        BasicPrinter basicPrinter=new BasicPrinter();
        Document printDocument=new Document("Printing a document");
        basicPrinter.PrintDocument(printDocument);
        assertEquals("Printing a document",basicPrinter.document.text);
    }

    @Test
    public void TestPrintMultiFunction(){
        MultiFunctionPrinter multiFunctionPrinter=new MultiFunctionPrinter();
        Document printDocument=new Document("Printing a document");
        multiFunctionPrinter.PrintDocument(printDocument);
        assertEquals("Printing a document",multiFunctionPrinter.document.text);
    }

    @Test
    public void TestScanMultiFunction(){
        MultiFunctionPrinter multiFunctionPrinter=new MultiFunctionPrinter();
        Document document=multiFunctionPrinter.Scan();
        assertEquals("This is a new document",document.text);
    }

    @Test
    public void TestFaxMultiFunction(){
        MultiFunctionPrinter multiFunctionPrinter=new MultiFunctionPrinter();
        multiFunctionPrinter.Fax();
        assertEquals(multiFunctionPrinter.faxOutput,"Fax is working");
    }


}
