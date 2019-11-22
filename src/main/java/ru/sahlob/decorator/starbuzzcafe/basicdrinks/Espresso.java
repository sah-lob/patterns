package ru.sahlob.decorator.starbuzzcafe.basicdrinks;

import ru.sahlob.decorator.starbuzzcafe.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
