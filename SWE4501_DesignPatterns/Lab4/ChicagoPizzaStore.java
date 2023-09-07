package Lab4;

public class ChicagoPizzaStore extends PizzaStore{
    protected Pizza createPizza(String item) {
        PizzaIngredientFactory ingredientFactory = new ChicaggoPizzaIngredientFactory();
        Pizza pizza=null;
        if (item.equals("cheese")) {
            pizza=new ChicagoStyleCheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza=new ChicagoStyleVeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza=new ChicagoStyleClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza=new ChicagoStylePepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        return pizza;
    }

}
