package heroes;

import behaviours.IAttackEnemies;
import enemies.Enemy;
import items.Item;
import rooms.Room;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Team {

    private ArrayList<Player> heroes;
    private Room currentRoom;
    private ArrayList<Item> sack;

    public Team()   {
        this.heroes = new ArrayList<>();
        this.currentRoom = new Room();
        this.sack = new ArrayList<>();
    }

    public void addHero(Player player){
        this.heroes.add(player);
    }

    public ArrayList<Player> getHeroes() {
        return heroes;
    }

    public void enterRoom(Room room){
        this.currentRoom = room;
    }

    public void openChest() {
        Scanner myObj = new Scanner (System.in);
        ArrayList<Item> remainingItems = new ArrayList<>();
        for (Item item: this.currentRoom.getChest()){
            System.out.println("You found: " + item.getName());
            System.out.println("Would you like to add this to the team sack? (y/n)");
            String userInput = myObj.next();
            if (userInput.equals("y")) {
                this.sack.add(item);
                System.out.println(item + " collected");
            }
            else {
                remainingItems.add(item);
            }
        }
        this.currentRoom.setChest(remainingItems);
        System.out.println("The player picked " + sack);
        System.out.println("The player left " + this.currentRoom.getChest());
    }

    public void fight() {
        while (!this.currentRoom.isRoomDefeated() && this.heroes.size() > 0) {
            Random rand = new Random();
            for (Player player : this.heroes) {
                if (player instanceof IAttackEnemies && this.currentRoom.getEnemies().size() > 0) {
                    Enemy currentEnemy = this.currentRoom.getEnemies().get(rand.nextInt(this.currentRoom.getEnemies().size()));
                    ((IAttackEnemies) player).attack(currentEnemy);
                    System.out.println(player.getName() + " hit " + currentEnemy.getType());
                    if (currentEnemy.getHealth() <= 0) {
                        this.currentRoom.getEnemies().remove(currentEnemy);
                        System.out.println(currentEnemy.getType() + " died");
                    }
                }
            }
            for (Enemy enemy : this.currentRoom.getEnemies()) {
                if (this.heroes.size() > 0 && this.currentRoom.getEnemies().size() > 0) {
                    Player currentPlayer = this.heroes.get(rand.nextInt(this.heroes.size()));
                    enemy.attack(currentPlayer);
                    System.out.println(enemy.getType() + " hit " + currentPlayer.getName());
                    if (currentPlayer.getHealth() <= 0) {
                        this.heroes.remove(currentPlayer);
                        System.out.println(currentPlayer.getName() + " died");
                    }
                }
            }
        }
        if (this.currentRoom.getEnemies().size() > 0) {
            System.out.println("Heroes defeated");
        } else {
            System.out.println("Enemies defeated");
        }

    }

}
