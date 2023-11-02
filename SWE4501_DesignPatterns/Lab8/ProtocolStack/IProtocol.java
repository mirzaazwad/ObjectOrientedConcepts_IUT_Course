package Lab8.ProtocolStack;

public abstract class IProtocol {
    protected String host;
    protected Integer port;
    protected String username;
    protected String password;
    protected String provider;
    protected String getServiceConfiguration(){
        return String.format("Configuration %s:%s@%s:%s",this.username,this.password,this.host,this.port);
    }
    public abstract String provideService();
}
