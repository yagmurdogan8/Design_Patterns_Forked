package headfirst.factorymethod;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza p = createPizza(type);

        p.prepare();
        p.bake();
        p.cut();
        p.box();

        return p;
    }

    public abstract Pizza createPizza(String type);
}
