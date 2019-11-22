package ru.sahlob.decorator.starbuzzcafe.additionaldrinks;

import ru.sahlob.decorator.starbuzzcafe.Beverage;

public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", soy";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
