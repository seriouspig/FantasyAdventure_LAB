package heroes.healers;

import heroes.Player;
import heroes.spellcasters.Wizard;
import items.HealingTool;

import java.util.ArrayList;

public class Cleric extends Player {

    private HealingTool healingTool;
    private ArrayList<HealingTool> sack;

    public Cleric(String name, int health, HealingTool healingTool) {
        super(name, health);
        this.healingTool = healingTool;
        this.sack = new ArrayList<>();
    }

    public HealingTool getHealingTool() {
        return healingTool;
    }

    public void setHealingTool(HealingTool healingTool) {
        this.healingTool = healingTool;
    }

    public ArrayList<HealingTool> getSack() {
        return sack;
    }

    public void setSack(ArrayList<HealingTool> sack) {
        this.sack = sack;
    }

    public void heal(Player player) {
        if (this.healingTool != null){
            player.setHealth(player.getHealth()+this.healingTool.getHealAmount());
            this.healingTool.setDurability(this.healingTool.getDurability() - 1);
            if (this.healingTool.getDurability() == 0){
                this.healingTool = null;
            }
        }

    }
}
