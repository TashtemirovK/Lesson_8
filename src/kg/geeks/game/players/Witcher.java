package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Witcher extends Hero{
    private int giveHealth;

    public Witcher(int health, int damage, String name) {
        super(health, damage, SuperAbility.GIVE_HEALTH, name);
    }
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if(heroes[i].getHealth() > 0) {
                heroes[i].setHealth(heroes[i].getHealth());
            }
        }
    }
}
