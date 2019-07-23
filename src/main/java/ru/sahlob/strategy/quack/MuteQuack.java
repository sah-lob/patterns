package ru.sahlob.strategy.quack;

public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("Помолчим..");
    }
}
