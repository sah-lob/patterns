package ru.sahlob.decorator.starbuzzcafe;

public abstract class Beverage {

    public String description = "Unknnown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
