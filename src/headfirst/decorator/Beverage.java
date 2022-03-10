package headfirst.decorator;

public abstract class Beverage {

    protected String description = "NA";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
