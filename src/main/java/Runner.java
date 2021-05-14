import enemies.Enemy;
import enemies.EnemyType;
import heroes.Team;
import heroes.healers.Cleric;
import heroes.spellcasters.CreatureType;
import heroes.spellcasters.MythicalCreature;
import heroes.spellcasters.Wizard;
import heroes.warriors.Knight;
import items.*;
import rooms.Room;

public class Runner {

    public static void main(String[] args) {

        Knight knight1;
        Cleric cleric1;
        Wizard wizard1;

        MythicalCreature creature1;

        Spell fireBall;
        Weapon basicSword;
        HealingTool camomile;
        HealingTool camomile2;

        Team team;

        Enemy werefolf;
        Enemy slime;

        Room room01;
        Room room02;

        fireBall = new Spell("Eye of fire", SpellType.FIRE, 20);
        basicSword = new Weapon("Blood drainer", WeaponType.SWORD, 10);
        camomile = new HealingTool("Camomile herb 1", HealingType.HERB, 15);
        camomile2 = new HealingTool("Camomile herb 2", HealingType.HERB, 15);
        creature1 = new MythicalCreature(CreatureType.RAINBOWCAT, 20);

        knight1 = new Knight("Camelot", 100, basicSword);
        cleric1 = new Cleric("Amadeus", 80, camomile);
        wizard1 = new Wizard("Aragon", 70, fireBall, creature1);

        team = new Team();
        team.addHero(knight1);
        team.addHero(cleric1);
        team.addHero(wizard1);

        werefolf = new Enemy(EnemyType.WEREWOLF);
        slime = new Enemy(EnemyType.SLIME);

        room01 = new Room();
        room01.addEnemyToRoom(slime);
        room01.addEnemyToRoom(werefolf);
        room01.addItemToChest(camomile2);

        room02 = new Room();
        room02.addItemToChest(camomile2);
        room02.addItemToChest(fireBall);

        team.enterRoom(room02);
        team.openChest();


    }
}
