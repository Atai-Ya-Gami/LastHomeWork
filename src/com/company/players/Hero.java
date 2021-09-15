package com.company.players;

import com.company.GameEntity;
import com.company.HavingAbility;
import com.company.IAbility;

public abstract class Hero extends GameEntity implements IAbility {
    private HavingAbility Ability;

    public HavingAbility getAbility() {
        return Ability;
    }

    public void setAbility(HavingAbility ability) {
        Ability = ability;
    }

    public Hero(int health, int damage, HavingAbility ability) {
        super(health, damage);
        Ability = ability;
    }

    public Hero(int health, int damage) {
        super(health, damage);
    }
}
