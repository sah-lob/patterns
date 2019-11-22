package ru.sahlob.decorator.starbuzzcafe.additionaldrinks;

import ru.sahlob.decorator.starbuzzcafe.Beverage;

public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
