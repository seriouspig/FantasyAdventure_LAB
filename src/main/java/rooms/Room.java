package rooms;

import enemies.Enemy;
import items.Item;

import java.util.ArrayList;

public class Room {

    private ArrayList<Enemy> enemies;
    private ArrayList<Item> chest;
    private boolean roomDefeated;

    public Room () {
        this.enemies = new ArrayList<>();
        this.chest = new ArrayList<>();
        this.roomDefeated = false;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public void setEnemies(ArrayList<Enemy> enemies) {
        this.enemies = enemies;
    }

    public ArrayList<Item> getChest() {
        return chest;
    }

    public void setChest(ArrayList<Item> chest) {
        this.chest = chest;
    }

    public void checkDefeatRoom(){
        if (this.enemies.size() == 0){
            this.roomDefeated = true;
        } else {
            this.roomDefeated = false;
        }
    }

    public boolean isRoomDefeated() {
        this.checkDefeatRoom();
        return roomDefeated;
    }

    public void setRoomDefeated(boolean roomDefeated) {
        this.roomDefeated = roomDefeated;
    }

    public void addItemToChest (Item item) {
        this.chest.add(item);
    }

    public void addEnemyToRoom (Enemy enemy) {
        this.enemies.add(enemy);
    }
}
