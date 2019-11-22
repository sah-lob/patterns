package ru.sahlob.decorator.starbuzzcafe.basicdrinks;

import ru.sahlob.decorator.starbuzzcafe.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark roast coffee";
    }

    @Override
    public double cost() {
        return 0;
    }
}
