package ru.sahlob.factory.kbarpizza.pizzastore;

import ru.sahlob.factory.kbarpizza.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String place, String type) {
        var pizza = createPizza(place, type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String place, String type);
}
