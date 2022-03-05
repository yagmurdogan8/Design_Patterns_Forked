package headfirst.observer;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemperature = Float.MIN_VALUE;
    private float minTemperature = Float.MAX_VALUE;
    private float totalTemperature;
    private int numReadings;

    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Avg/Max/Min temperature: %.1f/%.1f/%.1f\n", totalTemperature / numReadings, maxTemperature, minTemperature);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        if (temperature > maxTemperature) maxTemperature = temperature;
        if (temperature < minTemperature) minTemperature = temperature;

        totalTemperature += temperature;
        numReadings ++;

        display();
    }
}
