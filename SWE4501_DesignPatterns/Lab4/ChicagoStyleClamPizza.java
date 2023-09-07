package Lab4;

public class ChicagoStyleClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public ChicagoStyleClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    void prepare(){
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
