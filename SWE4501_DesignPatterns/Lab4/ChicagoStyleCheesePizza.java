package Lab4;

public class ChicagoStyleCheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public ChicagoStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    void prepare(){
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
