package ru.sahlob.observer.weatherStation;

public interface Observer {
    void update(int temp, int humidity, int pressure);
}
