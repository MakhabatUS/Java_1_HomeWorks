package hw_7;

public abstract class Hero implements HavingSuperAbility {
    private final int health;
    private final int damage;
    private final String superAbilityType;

    public Hero(int health, int damage, String superAbility) {
        this.health = health;
        this.damage = damage;
        this.superAbilityType = superAbility;
    }

    public String getSuperAbilityType() {
        return superAbilityType;
    }

    public void getInfo() {
        System.out.println(getClass().getSimpleName() +
                "\nHealth: " + health + " " + "\nDamage: " +  damage);

    }
}

