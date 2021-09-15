package com.company.players;

import com.company.HavingAbility;

import java.util.Random;

public class Magic extends Hero{
    public Magic(int health, int damage) {
        super(health, damage, HavingAbility.BOOST);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        for(int i = 0; i< heroes.length; i++){
            int RandomHero = new Random().nextInt(heroes.length - 1);
            int RandomAddDamage = new Random().nextInt(15);
            heroes[RandomHero].setDamage(heroes[RandomHero].getDamage() - RandomAddDamage);
            System.out.println("Magic add " + heroes[RandomHero].getClass().getSimpleName() + RandomAddDamage );
            break;
        }

    }
}
