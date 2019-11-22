package ru.sahlob.decorator.starbuzzcafe;

import ru.sahlob.decorator.starbuzzcafe.additionaldrinks.Milk;
import ru.sahlob.decorator.starbuzzcafe.additionaldrinks.Soy;
import ru.sahlob.decorator.starbuzzcafe.basicdrinks.Espresso;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Milk(beverage);
        beverage = new Milk(beverage);
        beverage = new Soy(beverage);


        System.out.println("Название напитка: " + beverage.getDescription());
        System.out.println("Цена за напиток: " + beverage.cost());

    }
}
