package Lab4;

public class NYStylePepperoniPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;
    public NYStylePepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    void prepare(){
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }

}
