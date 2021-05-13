package items;

public class HealingTool {

    private HealingType type;
    private int healAmount;
    private int durability;

    public HealingTool(HealingType type, int healAmount) {
        this.type = type;
        this.healAmount = healAmount;
        this.durability = type.getDurability();
    }

    public HealingType getType() {
        return type;
    }

    public void setType(HealingType type) {
        this.type = type;
    }

    public int getHealAmount() {
        return healAmount;
    }

    public void setHealAmount(int healAmount) {
        this.healAmount = healAmount;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
}
