package Lab6.Driver;

public class DBQO extends DriverOptimizationDecorator{
    private IDriver driver;
    public DBQO(IDriver driver){
        this.driver=driver;
    }

    public String initializeDriver(){
        return "Database Optimizer applied, "+driver.initializeDriver();
    }

    public Double getRuntime(){
        return 0.9*driver.getRuntime();
    }
}
