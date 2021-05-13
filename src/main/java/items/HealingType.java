package items;

public enum HealingType {

    HERB (5),
    POTION (1),
    GEL (3),
    MEDICINE (5),
    BANDAGES (1);

    private int durability;

    HealingType(int durability) {
        this.durability = durability;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
}
