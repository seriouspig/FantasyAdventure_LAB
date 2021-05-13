package heroes.spellcasters;

public class MythicalCreature {

    private CreatureType type;
    private int defence;

    public MythicalCreature(CreatureType type, int defence) {
        this.type = type;
        this.defence = defence;
    }

    public CreatureType getType() {
        return type;
    }

    public void setType(CreatureType type) {
        this.type = type;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
}
