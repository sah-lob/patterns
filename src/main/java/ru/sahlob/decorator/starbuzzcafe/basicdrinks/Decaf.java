package ru.sahlob.decorator.starbuzzcafe.basicdrinks;

import ru.sahlob.decorator.starbuzzcafe.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf coffee";
    }

    @Override
    public double cost() {
        return 0;
    }
}
