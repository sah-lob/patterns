package ru.sahlob.observable.fly;

public class FlyNoWay implements FlyBehavior {

    public void fly() {
        System.out.println("Сегодня без полетов.");
    }
}
