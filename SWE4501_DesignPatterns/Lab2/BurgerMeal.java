package Lab2;

public class BurgerMeal extends MealPreparation {
    @Override
    protected void prepareIngredients() {
        System.out.println("Preparing burger ingredients");
    }

    @Override
    protected void cook() {
        System.out.println("Cooking the burger");
    }

    @Override
    protected void eat() {
        System.out.println("Eating the burger");
    }

    @Override
    protected void prepareDessert(){
        System.out.println("Preparing Honey Cake");
    }

    @Override
    protected void eatDessert(){
        System.out.println("Eating Honey Cake");
    }
}