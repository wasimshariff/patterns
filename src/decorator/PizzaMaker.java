package decorator;

public class PizzaMaker {

	public static void main(String a[]) {
		Pizza p = new Tomato(new Tomato(new Tomato(new Mozarella(new Tomato(new PlainPizza())))));
		System.out.println(p.getDescription());
		System.out.println(p.getCost());

		
	}
}
