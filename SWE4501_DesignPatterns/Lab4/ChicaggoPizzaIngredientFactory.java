package Lab4;

public class ChicaggoPizzaIngredientFactory implements PizzaIngredientFactory{
    public Dough createDough() {
        return new ThickCrustDough();
    }
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }
    public Cheese createCheese() {
        return new Mozarella();
    }
    public Veggies[] createVeggies() {
        System.out.println("Contains Veggies: ");
        Veggies veggies[] = { new EggPlant(), new Spinach(), new BlackOlives() };
        System.out.println("");
        return veggies;
    }
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
    public Clams createClam() {
        return new FrozenClams();
    }
}
