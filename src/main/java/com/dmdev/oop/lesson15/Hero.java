package com.dmdev.oop.lesson15;

public abstract class Hero {

    private final String name;
    private final int damage;

    public Hero(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public abstract void attackEnemy(Enemy enemy);

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}
