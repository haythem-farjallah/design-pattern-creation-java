package org.example.factoryMethod;

public abstract class BurgerStore {

    abstract Burger createBurger(Burgers item);

    public Burger orderBurger(Burgers type) {
        Burger burger = createBurger(type);
        System.out.println("--- Making a " + burger.getName() + " ---");
        burger.prepare();
        burger.cook();
        burger.serve();
        return burger;
    }
}

