package assignment2.Independence;

public class Addition {
    private Integer num1,num2,result;
    public Addition(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }

    public void Sum(){
        this.Store(this.num1+this.num2);
    }

    private void Store(int result){
        this.result=result;
    }

    public Integer getResult(){
        return this.result;
    }

}
