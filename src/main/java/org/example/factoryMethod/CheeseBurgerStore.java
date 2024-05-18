package org.example.factoryMethod;

public class CheeseBurgerStore extends BurgerStore {
    @Override
    Burger createBurger(Burgers item) {
        if (item.equals(Burgers.CHEESE)) {
            return new CheeseBurger();
        } else if (item.equals(Burgers.DELUXECHEESE)) {
            return new DeluxeCheeseBurger();
        } else {
            return null;
        }
    }
}