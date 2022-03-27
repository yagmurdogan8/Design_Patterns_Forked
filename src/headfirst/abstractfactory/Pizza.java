package headfirst.abstractfactory;

public abstract class Pizza {
	String name;

	Dough dough;
	Sauce sauce;
	Veggies[] veggies;
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;

	abstract void prepare();

	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	public String toString() {
		String result = "---- " + name + " ----\n";
		if (dough != null) {
			result += dough + "\n";
		}
		if (sauce != null) {
			result += sauce + "\n";
		}
		if (cheese != null) {
			result += cheese + "\n";
		}
		if (veggies != null) {
			StringBuilder resultBuilder = new StringBuilder(result);
			for (Veggies v: veggies) {
				resultBuilder.append(v).append("\t");
			}
			result = resultBuilder.toString();
			result += "\n";
		}
		if (clam != null) {
			result += clam + "\n";
		}
		if (pepperoni != null) {
			result += pepperoni + "\n";
		}
		return result;
	}
}
