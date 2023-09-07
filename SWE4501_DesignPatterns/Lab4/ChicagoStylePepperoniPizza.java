package Lab4;

public class ChicagoStylePepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public ChicagoStylePepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    void prepare(){
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
