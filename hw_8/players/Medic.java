package hw_8.players;

public class Medic extends Hero {
    private final int healPoints;
    private final String name;

    public String getName() {
        return name;
    }


    public Medic(int health, int damage, int healPoints, String name) {
        super(health, damage, SuperAbility.HEAL);
        this.healPoints = healPoints;
        this.name = name;
    }

    @Override
    public void applySuperAbilityBeforeRound(Boss boss, Hero[] heroes) {

    }

    @Override
    public void applySuperAbilityAfterRound(Boss boss, Hero[] heroes) {
        if (!boss.is_Stunned()) {
            for (Hero hero : heroes) {
                if (hero.getHealth() > 0 && hero != this) {
                    hero.setHealth(hero.getHealth() + healPoints);
                }
            }
            System.out.println("Medic heals the heroes for " + healPoints);
        }

    }
}


