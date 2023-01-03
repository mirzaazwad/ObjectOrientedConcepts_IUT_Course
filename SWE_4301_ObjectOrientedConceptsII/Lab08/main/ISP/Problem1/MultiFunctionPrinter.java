package Lab08.ISP.Problem1;

public class MultiFunctionPrinter implements AbstractBasicPrinter,AbstractMultiFunctionforPrinter{
    public Document document;
    public String faxOutput;
    public void PrintDocument(Document document){
        this.document=document;
    }
    public void Fax(){
        this.faxOutput="Fax is working";
    }
    public Document Scan(){
        Document document=new Document("This is a new document");
        return document;
    }

}
