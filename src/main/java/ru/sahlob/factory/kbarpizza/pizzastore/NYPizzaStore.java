package ru.sahlob.factory.kbarpizza.pizzastore;

import ru.sahlob.factory.kbarpizza.pizza.*;
import ru.sahlob.factory.kbarpizza.pizza.ny.NYStyleCheesePizza;
import ru.sahlob.factory.kbarpizza.pizza.ny.NYStyleClamPizza;
import ru.sahlob.factory.kbarpizza.pizza.ny.NYStylePepperoniPizza;
import ru.sahlob.factory.kbarpizza.pizza.ny.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String place, String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        } else if (type.equals("clam")) {
            pizza = new NYStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        }
        return pizza;
    }
}