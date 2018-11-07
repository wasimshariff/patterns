package decorator;

public class Tomato implements Pizza {
	
	private Pizza pizza;

    public Tomato(Pizza newPizza) {

    	pizza = newPizza;

        System.out.println("Adding Dough");

        System.out.println("Adding Tomato");

    }

    public String getDescription(){

        return pizza.getDescription() + ", Tomato";

    }

    public double getCost(){

        System.out.println("Cost of Tom: " + .90);

        return pizza.getCost() + .90;

    }

}

