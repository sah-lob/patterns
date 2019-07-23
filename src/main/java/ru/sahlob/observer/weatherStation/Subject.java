package ru.sahlob.observer.weatherStation;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyOvservers();
}
