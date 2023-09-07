package Lab4;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    public Dough createDough() {
        return new ThinCrustDough();
    }
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
    public Veggies[] createVeggies() {
        System.out.println("Contains Veggies: ");
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        System.out.println("");
        return veggies;
    }
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
    public Clams createClam() {
        return new FreshClams();
    }

}
