package ru.sahlob.factory.kbarpizza.pizzastore;

import ru.sahlob.factory.kbarpizza.pizza.Pizza;
import ru.sahlob.factory.kbarpizza.pizza.chicago.ChicagoStyleCheesePizza;
import ru.sahlob.factory.kbarpizza.pizza.chicago.ChicagoStyleClamPizza;
import ru.sahlob.factory.kbarpizza.pizza.chicago.ChicagoStylePepperoniPizza;
import ru.sahlob.factory.kbarpizza.pizza.chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String place, String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        }
        return pizza;
    }
}
