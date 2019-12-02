package ru.sahlob.factory.kbarpizza.pizza.ny;

import ru.sahlob.factory.kbarpizza.pizza.Pizza;

public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza() {
        name = "NY Clam pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }
}
