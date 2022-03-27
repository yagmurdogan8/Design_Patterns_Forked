package headfirst.abstractfactory;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
 
		Pizza p1 = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + p1 + "\n");
 
		Pizza p2 = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + p2 + "\n");
	}
}
