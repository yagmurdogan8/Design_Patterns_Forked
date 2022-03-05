package headfirst.observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure;
    private float lastPressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        String prediction = (currentPressure < lastPressure) ? "Watch out for cooler, rainy weather"
                : (currentPressure == lastPressure) ? "More of the same"
                : "Improving weather on the way!";

        System.out.printf("Forecast: %s\n", prediction);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }
}
