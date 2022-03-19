package headfirst.factorymethod;

public class PizzaTestDrive {

    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza1 = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza1.getName() + "\n");

        Pizza pizza2 = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza2.getName() + "\n");
    }
}
