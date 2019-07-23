package ru.sahlob.strategy;

import ru.sahlob.strategy.fly.FlyWithWings;
import ru.sahlob.strategy.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("Кряква");
    }
}
