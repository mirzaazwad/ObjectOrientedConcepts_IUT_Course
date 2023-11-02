package Lab6.Driver;

public class ODBC implements IDriver{
    private String client;
    private String hostname;
    private Integer port;
    private Double runtime;

    public ODBC(String client,String hostname,Integer port){
        this.client=client;
        this.hostname=hostname;
        this.port=port;
        this.runtime=0.31;
    }
    public String initializeDriver(){
        return String.format("Established ODBC Connection at %s@%s:%d",this.client,this.hostname,this.port);
    }

    public Double getRuntime(){
        return this.runtime;
    }
}
