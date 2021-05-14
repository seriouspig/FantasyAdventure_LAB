package items;

public class Weapon extends Item{

    private WeaponType type;
    private int damage;

    public Weapon(String name, WeaponType type, int damage) {
        super (name);
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
