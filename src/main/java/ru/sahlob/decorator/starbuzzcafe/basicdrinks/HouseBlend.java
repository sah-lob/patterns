package ru.sahlob.decorator.starbuzzcafe.basicdrinks;

import ru.sahlob.decorator.starbuzzcafe.Beverage;

public class HouseBlend extends Beverage {


    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0;
    }
}
