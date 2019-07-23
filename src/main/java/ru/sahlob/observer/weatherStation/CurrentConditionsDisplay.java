package ru.sahlob.observer.weatherStation;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private int temp;
    private int humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(int temp, int humidity, int pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temp + "C degrees and " + humidity + "% humidity");
    }
}
