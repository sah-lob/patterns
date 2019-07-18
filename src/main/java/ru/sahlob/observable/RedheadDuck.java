package ru.sahlob.observable;

import ru.sahlob.observable.fly.FlyWithWings;
import ru.sahlob.observable.quack.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("Красноголовая утка.");
    }
}
