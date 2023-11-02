package Lab6.Driver;

public class JDBC implements IDriver{
    private String client;
    private String hostname;
    private Integer port;
    private Double runtime;


    public JDBC(String client,String hostname,Integer port){
        this.client=client;
        this.hostname=hostname;
        this.port=port;
        this.runtime=0.28;
    }
    public String initializeDriver(){
        return String.format("Established JDBC Connection at %s@%s:%d",this.client,this.hostname,this.port);
    }

    public Double getRuntime(){
        return this.runtime;
    }


}
