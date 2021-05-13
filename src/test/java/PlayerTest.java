import enemies.Enemy;
import enemies.EnemyType;
import heroes.healers.Cleric;
import heroes.spellcasters.CreatureType;
import heroes.spellcasters.MythicalCreature;
import heroes.spellcasters.Wizard;
import heroes.warriors.Knight;
import items.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Knight knight1;
    Cleric cleric1;
    Wizard wizard1;

    MythicalCreature creature1;

    Spell fireBall;
    Weapon basicSword;
    HealingTool camomile;
    HealingTool camomile2;

    Enemy werefolf;
    Enemy slime;

    @Before
    public void before() {
        fireBall = new Spell(SpellType.FIRE, 20);
        basicSword = new Weapon(WeaponType.SWORD, 10);
        camomile = new HealingTool(HealingType.HERB, 15);
        camomile2 = new HealingTool(HealingType.HERB, 15);
        creature1 = new MythicalCreature(CreatureType.RAINBOWCAT, 20);

        knight1 = new Knight("Camelot", 100, basicSword);
        cleric1 = new Cleric("Amadeus", 80, camomile);
        wizard1 = new Wizard("Aragon", 70, fireBall, creature1);

        werefolf = new Enemy(EnemyType.WEREWOLF);
        slime = new Enemy(EnemyType.SLIME);


    }

    @Test
    public void clericCanHeal() {
        cleric1.heal(wizard1);
        assertEquals(85, wizard1.getHealth());
        assertEquals(5, camomile2.getType().getDurability());
    }

    @Test
    public void charactersCanAttack() {
        knight1.attack(werefolf);
        slime.attack(cleric1);
        assertEquals(30, werefolf.getHealth());
        assertEquals(70, cleric1.getHealth());
    }
}
