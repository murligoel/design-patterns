package com.practice.factorydesignpattern;

class SimpleWheatBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Simple Wheat Burger prepared");
    }
}

class StandardWheatBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Standard Wheat Burger prepared");
    }
}

class PremiumWheatBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Premium Wheat Burger prepared");
    }
}

interface NewBurgerFactory {
    Burger createBurger(String type);
}

class SinghBurger implements NewBurgerFactory {
    @Override
    public Burger createBurger(String type) {
        if (type.equalsIgnoreCase("basic")) {
            return new SimpleBurger();
        } else if (type.equalsIgnoreCase("standard")) {
            return new StandardBurger();
        } else if (type.equalsIgnoreCase("premium")) {
            return new PremiumBurger();
        } else {
            System.out.println("Invalid burger type!");
            return null;
        }
    }
}

class KingBurger implements NewBurgerFactory {

    @Override
    public Burger createBurger(String type) {
        if (type.equalsIgnoreCase("basic")) {
            return new SimpleWheatBurger();
        } else if (type.equalsIgnoreCase("standard")) {
            return new StandardWheatBurger();
        } else if (type.equalsIgnoreCase("premium")) {
            return new PremiumWheatBurger();
        } else {
            System.out.println("Invalid burger type!");
            return null;
        }
    }
}
public class FactoryMethod {

    public static void main(String[] args) {
        String type = "basic";

        NewBurgerFactory myFactory = new KingBurger();
        Burger burger = myFactory.createBurger(type);

        if (burger != null) {
            burger.prepare();
        }
    }
}
