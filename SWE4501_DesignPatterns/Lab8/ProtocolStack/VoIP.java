package Lab8.ProtocolStack;

public class VoIP extends IProtocol{
    public VoIP(String username,String password,String host,Integer port,String provider){
        this.username=username;
        this.password=password;
        this.host=host;
        this.port=port;
        this.provider=provider;
    }
    public String provideService(){
        return String.format("Starting call by %s ",this.provider)+"using "+this.getServiceConfiguration();
    }
}
