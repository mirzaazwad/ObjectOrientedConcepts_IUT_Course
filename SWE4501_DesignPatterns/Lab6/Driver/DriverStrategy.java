package Lab6.Driver;

public class DriverStrategy {
    private IDriver driverContext;
    public DriverStrategy(IDriver driverContext){
        this.driverContext=driverContext;
    }

    public String executeStrategy(){
        return driverContext.initializeDriver();
    }
    public Double getRuntime(){
        return driverContext.getRuntime();
    }
}
