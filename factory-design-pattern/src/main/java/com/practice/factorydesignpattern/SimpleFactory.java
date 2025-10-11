package com.practice.factorydesignpattern;

interface Burger {
    public void prepare();
}

class SimpleBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Simple Burger prepared");
    }
}

class StandardBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Standard Burger prepared");
    }
}

class PremiumBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Premium Burger prepared");
    }
}

class BurgerFactory {
    public Burger createBurger(String type) {
        if (type.equals("Standard")) {
            return new StandardBurger();
        } else if (type.equals("Simple")) {
            return new SimpleBurger();
        } else if (type.equals("Premium")) {
            return new PremiumBurger();
        } else {
            System.out.println("Invalid burger type!");
            return null;
        }
    }
}

public class SimpleFactory {

    public static void main(String[] args) {

        String type = "Standard";

        BurgerFactory factory = new BurgerFactory();
        Burger burger = factory.createBurger(type);
        burger.prepare();
    }
}
