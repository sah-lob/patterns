package ru.sahlob.factory.kbarpizza.pizzastore;

import ru.sahlob.factory.kbarpizza.PizzaOrder;
import ru.sahlob.factory.kbarpizza.pizza.Pizza;

public class PizzaStoreFactory  extends PizzaStore {

    @Override
    protected Pizza createPizza(String place, String type) {
        Pizza pizza = null;
        if (place.equals("NY")) {
            pizza = new NYPizzaStore().createPizza(place, type);
        } else if (place.equals("Chicago")) {
            pizza = new ChicagoPizzaStore().createPizza(place, type);
        }
        return pizza;
    }
}
