package heroes.warriors;

import behaviours.IAttackEnemies;
import enemies.Enemy;
import heroes.Player;
import items.Weapon;

import java.util.ArrayList;

public class Knight extends Player implements IAttackEnemies {

    private Weapon currentWeapon;
    private ArrayList<Weapon> sack;

    public Knight(String name, int health, Weapon currentWeapon) {
        super(name, health);
        this.currentWeapon = currentWeapon;
        this.sack = new ArrayList<>();
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    public ArrayList<Weapon> getSack() {
        return sack;
    }

    public void setSack(ArrayList<Weapon> sack) {
        this.sack = sack;
    }

    public void attack(Enemy enemy) {
        enemy.setHealth(enemy.getHealth() - this.currentWeapon.getDamage());
    }
}
