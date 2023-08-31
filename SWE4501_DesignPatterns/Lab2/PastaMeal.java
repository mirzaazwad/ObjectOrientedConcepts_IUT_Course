package Lab2;

public class PastaMeal extends MealPreparation {
    @Override
    protected void prepareIngredients() {
        System.out.println("Preparing pasta ingredients");
    }

    @Override
    protected void cook() {
        System.out.println("Boiling pasta");
    }

    @Override
    protected void eat(){
        System.out.println("Eating Pasta");
    }

    @Override
    protected void prepareDessert(){
        System.out.println("Preparing Chocolate Cake");
    }

    @Override
    protected void eatDessert(){
        System.out.println("Eating Chocolate Cake");
    }

}