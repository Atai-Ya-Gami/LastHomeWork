package com.company.players;

import com.company.HavingAbility;

import java.util.Random;

public class Hunter extends Hero{


    public Hunter(int health, int damage) {
        super(health, damage, HavingAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        int isAbilityAvailable = new Random().nextInt(2);
        if(isAbilityAvailable = 1){
        int DecreaseNum = new Random().nextInt(15);
        boss.setDamage(boss.getDamage() - DecreaseNum);
        System.out.println("Hunter decrease Boss damage on " + DecreaseNum);

    }
    }

}
