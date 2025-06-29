package com.dmdev.oop.lesson15;

import com.dmdev.oop.lesson18.weapon.RangeWeapon;

public class Archer<T extends RangeWeapon> extends Hero<T> {

    private final Wolf wolf;

    public Archer(String name, int damage) {
        super(name, damage);
        this.wolf = new Wolf("Wolf", 7);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        class Test {

        }
        var test = new Test();

        System.out.println(getName() + " стрельнул из лука в " + enemy.getName());
        wolf.attackEnemy(enemy);
    }

    private class Wolf {

        private final String name;
        private final int damage;

        public Wolf(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public void attackEnemy(Enemy enemy) {
            System.out.println(name + " и " + Archer.this.getName() + " наносят совместный урон");
            enemy.takeDamage(damage + Archer.this.getDamage());
        }
    }
}
