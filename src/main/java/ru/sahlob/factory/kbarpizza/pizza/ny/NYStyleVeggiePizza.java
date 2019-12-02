package ru.sahlob.factory.kbarpizza.pizza.ny;

import ru.sahlob.factory.kbarpizza.pizza.Pizza;

public class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza() {
        name = "NY veggie pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }
}
