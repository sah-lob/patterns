package ru.sahlob.factory.kbarpizza.pizza;

import java.util.ArrayList;

public abstract class Pizza {
    public String name;
    public String dough;
    public String sauce;
    public ArrayList<String> toppings = new ArrayList<String>();


    public void prepare() {
        System.out.println("Подготовка " + name);
        System.out.println("Подбрасываем тесто...");
        System.out.println("Добавляем соус...");
        System.out.println("Добавляем начинку: ");
        for (String topping : toppings) {
            System.out.println("  " + topping);
        }
    }

    public void bake() {
        System.out.println("Печем 25 минут в духовке");
    }
    public void cut() {
        System.out.println("Разрезаем пиццу.");
    }

    public void box() {
        System.out.println("Кладем пиццу в коробку");
    }

    public String getName() {
        return name;
    }
}
