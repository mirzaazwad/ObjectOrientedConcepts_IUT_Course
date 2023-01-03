package L05_Tasks.ThirdTask;

public class Faculty extends Person{
    public String designation;
    public Faculty(String name, String address, int age,String designation){
        super(name,address,age);
        this.designation=designation;
    }

    @Override
    public String toString(){
        return this.name+"\t"+this.address+"\t"+Integer.toString(this.age)+"\t"+this.designation;
    }


}
