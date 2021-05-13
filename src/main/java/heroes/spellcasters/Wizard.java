package heroes.spellcasters;

import behaviours.IAttackEnemies;
import enemies.Enemy;
import heroes.Player;
import items.Spell;

import java.util.ArrayList;

public class Wizard extends Player implements IAttackEnemies {

    private Spell currentSpell;
    private MythicalCreature creature;
    private ArrayList<Spell> sack;

    public Wizard(String name, int health, Spell currentSpell, MythicalCreature creature) {
        super(name, health);
        this.currentSpell = currentSpell;
        this.creature = creature;
        this.sack = new ArrayList<>();
    }

    public Spell getCurrentSpell() {
        return currentSpell;
    }

    public void setCurrentSpell(Spell currentSpell) {
        this.currentSpell = currentSpell;
    }

    public MythicalCreature getCreature() {
        return creature;
    }

    public void setCreature(MythicalCreature creature) {
        this.creature = creature;
    }

    public ArrayList<Spell> getSack() {
        return sack;
    }

    public void setSack(ArrayList<Spell> sack) {
        this.sack = sack;
    }

    public void attack(Enemy enemy) {
        enemy.setHealth(enemy.getHealth() - this.currentSpell.getDamage());
    }
}
