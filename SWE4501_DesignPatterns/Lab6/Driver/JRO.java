package Lab6.Driver;

public class JRO extends DriverOptimizationDecorator{
    private IDriver driver;
    public JRO(IDriver driver){
        this.driver=driver;
    }

    public String initializeDriver(){
        return "Java Runtime Optimizer applied, "+driver.initializeDriver();
    }

    public Double getRuntime(){
        return 0.8*driver.getRuntime();
    }
}
