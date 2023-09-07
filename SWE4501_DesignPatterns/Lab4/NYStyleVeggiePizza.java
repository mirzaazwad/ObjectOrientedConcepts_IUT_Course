package Lab4;

public class NYStyleVeggiePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;
    public NYStyleVeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    void prepare(){
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }

}
