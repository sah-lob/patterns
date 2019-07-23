package ru.sahlob.strategy;

import ru.sahlob.strategy.fly.FlyNoWay;
import ru.sahlob.strategy.quack.MuteQuack;

public class DecoyDuck extends Duck {


    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("Еще один вид утки!");
    }
}
