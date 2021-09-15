package com.company.players;

import com.company.HavingAbility;

import java.util.Random;

public class Medic extends Hero{
    public Medic(int health, int damage) {
        super(health, damage, HavingAbility.HEAL);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        for(int i = 0; i<heroes.length; i++){
            if(this !=heroes[i] && heroes[i].getHealth()>0){
                int RandomHeal = new Random().nextInt(15);
                int RandomHero = new Random().nextInt(heroes.length-1);
                heroes[RandomHero].setHealth(heroes[RandomHero].getHealth()+RandomHeal);
                System.out.println("Medic heal " + heroes[i].getClass().getSimpleName() + " on " + RandomHeal + " xp.");
            }
        }

    }
}
