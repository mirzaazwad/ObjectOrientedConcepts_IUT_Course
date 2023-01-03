package assignment2.Independence;

public class Multiplication{
    private Integer num1,num2,result;
    public Multiplication(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }

    public void Product(){
        this.Store(this.num1*this.num2);
    }

    private void Store(int result){
        this.result=result;
    }

    public Integer getResult(){
        return this.result;
    }
}
