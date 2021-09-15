package com.company.players;

import com.company.HavingAbility;

public class Warrior extends Hero{
    public Warrior(int health, int damage) {
        super(health, damage, HavingAbility.SAVE_AND_REVERT);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        boss.setHealth(boss.getHealth() - boss.getDamage());
        System.out.println("Warrior revert boss attack");

    }
}
