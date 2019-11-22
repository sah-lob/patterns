package ru.sahlob.decorator.starbuzzcafe.additionaldrinks;

import ru.sahlob.decorator.starbuzzcafe.Beverage;

public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();
}
