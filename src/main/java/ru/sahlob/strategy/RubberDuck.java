package ru.sahlob.strategy;

import ru.sahlob.strategy.fly.FlyNoWay;
import ru.sahlob.strategy.quack.Quack;

public class RubberDuck extends Duck {

        public RubberDuck() {
            quackBehavior = new Quack();
            flyBehavior = new FlyNoWay();
        }

        public void display() {
            System.out.println("Резиновое кря кря!");
        }
}
