package com.company.GameFunc;

import com.company.players.*;

public class RpgGame {
    public static int roundCounter = 0;
    private static void round(Hero heroes[], Boss boss){
        for (Hero hero : heroes) {
            if(hero.getHealth()>0){
                bossHit(heroes, boss);
            }

        }
        heroHit(heroes,boss);
        appleSuperAbility(heroes,boss);
        printStatistics(heroes,boss);

    }
    private static void appleSuperAbility(Hero heroes[], Boss boss){
        for (Hero hero : heroes){
            if(hero.getHealth()> 0){
                hero.useAbility(heroes, boss);
            }
        }
    }

    public static void start(){
        Boss Boss = new Boss(700, 50);
        Hero Warrior = new Warrior(120,20);
        Hero Hunter = new Hunter(120,20);
        Hero Magic = new Magic(110,15);
        Hero Medic = new Medic(100,0);
        Hero heroes[] = {Warrior, Hunter, Magic, Medic};
        printStatistics(heroes, Boss);

        while (!isFinish(heroes, Boss)){
            roundCounter++;
            round(heroes, Boss);

        }
    }

    public static void printStatistics(Hero heroes[], Boss boss){
        System.out.println("----------------");
        System.out.println("Round :" + roundCounter);
        System.out.println("Boss Health" + boss.getHealth());
        for(Hero hero : heroes){
            System.out.println("Hero " + hero.getClass().getSimpleName() + " health :" + hero.getHealth());
        }
        System.out.println("----------------");
    }
    private static void heroHit(Hero heroes[], Boss boss){
        for (Hero hero : heroes) {
            if( hero.getHealth() > 0){
                boss.setHealth(boss.getHealth() - hero.getDamage());
            }else{
                break;
            }
        }
    }
    private static void bossHit(Hero heroes[], Boss boss){
        for (Hero hero : heroes) {
            if(boss.getHealth()>0 && hero.getHealth()<0){
                hero.setHealth(hero.getHealth()- boss.getDamage());
            }else{
                break;
            }

        }
    }
    private static boolean isFinish(Hero heroes[], Boss boss){
            if(boss.getHealth()<= 0){
                System.out.println("Heroes won!!");
                return true;
        }
            boolean allHeroesDead = true;
            for (Hero hero :  heroes) {
                if(hero.getHealth()>0){
                allHeroesDead = false;
                break;
            }
                }
        if (allHeroesDead){
            System.out.println("Boss won!!");
        }
        return allHeroesDead;
    }

}
