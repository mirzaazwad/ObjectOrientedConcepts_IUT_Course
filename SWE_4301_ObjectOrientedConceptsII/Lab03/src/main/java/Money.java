public class Money {
    protected int amount;
    public int getAmount(){
        return this.amount;
    }

    public boolean equals(Object a){//Object is not by default a Franc object
        return amount==((Money)a).getAmount() && this.getClass()==a.getClass();
    }
}
