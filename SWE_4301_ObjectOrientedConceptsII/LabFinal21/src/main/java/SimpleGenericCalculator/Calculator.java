package SimpleGenericCalculator;

public class Calculator implements Operation<Double>{
    public Double add(Double num1,Double num2){
        return num1+num2;
    }
    public Double subtract(Double num1,Double num2){
        return num1-num2;
    }
    public Double multiply(Double num1,Double num2){
        return num1*num2;
    }
    public Double divide(Double num1,Double num2){
        return num1/num2;
    }
}
