package hw_8.players;

public abstract class Hero extends GameEntity
        implements HavingSuperAbility{
    private final SuperAbility superAbility;

    public Hero(int health, int damage, SuperAbility superAbility) {
        super(health, damage);
        this.superAbility = superAbility;
    }

}

