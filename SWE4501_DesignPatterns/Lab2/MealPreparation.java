package Lab2;

import java.util.Scanner;

public abstract class MealPreparation {
    public final void prepareMeal() {
        prepareIngredients();
        cook();
        eat();
        if (customerWantsDessert()) {
            prepareDessert();
            eatDessert();
        }
    }

    protected abstract void prepareIngredients();
    protected abstract void cook();
    protected abstract void eat();

    protected void prepareDessert() {
        System.out.println("Preparing Vanilla Cake");
    }

    protected boolean customerWantsDessert() {
        String customerWant;
        System.out.println("Would you like desert? ");
        Scanner scanner=new Scanner(System.in);
        customerWant=scanner.nextLine();
        if(customerWant.charAt(0)=='y' || customerWant.charAt(0)=='Y'){
            return true;
        }
        else{
            System.out.println("Hope you enjoyed your meal");
            return false;
        }
    }

    protected void eatDessert() {
        System.out.println("Eating Vanilla Cake");
    }
}