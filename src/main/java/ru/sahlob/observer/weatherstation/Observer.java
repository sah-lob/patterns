package ru.sahlob.observer.weatherstation;

public interface Observer {
    void update(int temp, int humidity, int pressure);
}
