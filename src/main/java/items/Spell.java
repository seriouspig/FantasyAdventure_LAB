package items;

public class Spell extends Item{

    private SpellType spell;
    private int damage;

    public Spell(String name, SpellType spell, int damage) {
        super (name);
        this.spell = spell;
        this.damage = damage;
    }

    public SpellType getSpell() {
        return spell;
    }

    public void setSpell(SpellType spell) {
        this.spell = spell;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
