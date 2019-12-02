package ru.sahlob.factory.kbarpizza.pizza.ny;

import ru.sahlob.factory.kbarpizza.pizza.Pizza;

public class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza() {
        name = "NY pepperoni pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }
}
