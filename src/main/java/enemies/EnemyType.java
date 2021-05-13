package enemies;

public enum EnemyType {

    VAMPIRE(30, 10),
    ZOMBIE(15,5),
    WEREWOLF(40,20),
    GIANTRAT(5,5),
    SLIME(20,10),
    OGRE(50,30),
    TROLL(60,40),
    DRAGON(80,50),
    SHREK(20,10),
    SKELETON(5,10),
    ZOMBIEPIGMAN(15,10),
    GHAST(30,10),
    ENDERMAN(40,30);

    private int health;
    private int damage;

    EnemyType(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }
}
