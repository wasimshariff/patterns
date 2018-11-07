package decorator;

public class Mozarella implements Pizza {
	
	private Pizza pizza;

    public Mozarella(Pizza newPizza) {

    	pizza = newPizza;

        System.out.println("Adding Dough");

        System.out.println("Adding Moz");

    }

    public String getDescription(){

        return pizza.getDescription() + ", mozzarella";

    }

    public double getCost(){

        System.out.println("Cost of Moz: " + .50);

        return pizza.getCost() + .50;

    }

}

