package Lab4;

public class ChicagoStyleVeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public ChicagoStyleVeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    void prepare(){
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
