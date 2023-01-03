package CodeSmellA;

public class ComputerPrice {
    public boolean hasSamePrice(ComputerMarketInformation c1, ComputerMarketInformation c2){
        return c1.getPrice()==c2.getPrice();
    }
}
