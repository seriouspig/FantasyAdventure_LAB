package enemies;

import behaviours.IAttackPlayers;
import heroes.Player;

public class Enemy implements IAttackPlayers {

    private EnemyType type;
    private int health;
    private int damage;

    public Enemy( EnemyType type) {
        this.health = type.getHealth();
        this.type = type;
        this.damage = type.getDamage();
    }

    public EnemyType getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void attack(Player player) {
        player.setHealth(player.getHealth() - this.damage);

    }
}
