package hw_5;

public class Hero {


    private final int health;
    private final int damage;
    private String superpower;

    public Hero(int health, int damage, String superpower) {
        this.superpower = superpower;
        this.health = health;
        this.damage = damage;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }



    public int getHealth() {
        return health;
    }


    public int getDamage() {
        return damage;
    }

    public String getSuperpower() {
        return superpower;
    }


    @Override
    public String toString() {
        return "Hero: " +
                "health=" + health +
                ", damage=" + damage +
                ", superpower='" + superpower + '\'';
    }
}

