package Lab08.ISP.Problem1;

public class BasicPrinter implements AbstractBasicPrinter{
    public Document document;
    public void PrintDocument(Document document){
        this.document=document;
    }
}
