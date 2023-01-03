package L05_Tasks.ThirdTask;

public class Person {
    protected String name,address;
    protected int age;
    public Person(String name, String address, int age){
        this.name=name;
        this.address=address;
        this.age=age;
    }

    @Override
    public String toString(){
        return this.name+"\t"+this.address+"\t"+Integer.toString(this.age)+"\t";
    }

}
