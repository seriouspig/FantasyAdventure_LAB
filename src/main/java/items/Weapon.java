package items;

public class Weapon {

    private WeaponType type;
    private int damage;

    public Weapon(WeaponType type, int damage) {
        this.type = type;
        this.damage = damage;
    }

    public WeaponType getType() {
        return type;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
