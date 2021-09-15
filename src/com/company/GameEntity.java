package com.company;

public abstract class GameEntity {
    private int Health;
    private int Damage;

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        if(health<0){
            health = 0;
        }else {
            Health = health;
        }
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public GameEntity(int health, int damage) {
        Health = health;
        Damage = damage;
    }
}
