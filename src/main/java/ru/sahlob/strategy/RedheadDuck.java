package ru.sahlob.strategy;

import ru.sahlob.strategy.fly.FlyWithWings;
import ru.sahlob.strategy.quack.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("Красноголовая утка.");
    }
}
