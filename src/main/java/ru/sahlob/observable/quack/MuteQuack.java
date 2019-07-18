package ru.sahlob.observable.quack;

public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("Помолчим..");
    }
}
