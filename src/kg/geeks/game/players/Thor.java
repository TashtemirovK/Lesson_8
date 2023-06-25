package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Thor extends Hero {
    public Thor(int health, int damage, String name){
        super(health, damage, SuperAbility.HITS_BOSS, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean X = RPG_Game.random.nextBoolean();
        for (int i = 0; i < heroes.length; i++) {
            if(heroes[i].getHealth() > 0 && X == true) {
                boss.setDamage(0);
            } else {
                boss.setDamage(50);
            }
        }
    }
}
