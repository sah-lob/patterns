package ru.sahlob.observer.weatherstation;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyOvservers();
}
