package Lab4;

public abstract class PizzaStore {
    protected abstract Pizza createPizza(String type);
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza=createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
