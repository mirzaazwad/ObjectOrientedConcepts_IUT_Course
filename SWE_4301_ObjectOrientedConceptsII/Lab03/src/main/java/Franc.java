public class Franc extends Money {
    public Franc(int amount){
        this.amount=amount;
    }

    public Franc times(int multiplier){
        amount*=multiplier;
        return new Franc(amount);
    }

    public int getAmount(){
        return this.amount;
    }


}
