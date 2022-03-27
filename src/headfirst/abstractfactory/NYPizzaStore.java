package headfirst.abstractfactory;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {
		Pizza pizza;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

		switch (item) {
			case "cheese" -> {
				pizza = new CheesePizza(ingredientFactory);
				pizza.setName("New York Style Cheese Pizza");
			}
			case "veggie" -> {
				pizza = new VeggiePizza(ingredientFactory);
				pizza.setName("New York Style Veggie Pizza");
			}
			case "clam" -> {
				pizza = new ClamPizza(ingredientFactory);
				pizza.setName("New York Style Clam Pizza");
			}
			case "pepperoni" -> {
				pizza = new PepperoniPizza(ingredientFactory);
				pizza.setName("New York Style Pepperoni Pizza");
			}
			default -> throw new IllegalStateException("Unexpected value: " + item);
		}
		return pizza;
	}
}
