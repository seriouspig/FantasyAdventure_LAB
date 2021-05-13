package items;

public class Spell {

    private SpellType spell;
    private int damage;

    public Spell(SpellType spell, int damage) {
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
