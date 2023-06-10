package hw_8.players;

public interface HavingSuperAbility {
    void applySuperAbilityBeforeRound(Boss boss, Hero[] heroes);
    void applySuperAbilityAfterRound(Boss boss, Hero[] heroes);
}
