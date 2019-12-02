package ru.sahlob.factory.kbarpizza;

import ru.sahlob.factory.kbarpizza.pizzastore.PizzaStore;
import ru.sahlob.factory.kbarpizza.pizzastore.PizzaStoreFactory;

public class PizzaOrder {

    public static void main(String[] args) {

        PizzaStore pizzaStore = new PizzaStoreFactory();
        var pizza = pizzaStore.orderPizza("NY", "cheese");

        System.out.println(pizza.name);
    }
}
