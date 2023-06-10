package hw_5;

public class Main {


    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setBossDefenceType("Random");
        boss.setDamage(50);
        boss.bossInfo();


        for (Hero hero :  createHeroes2()) {
            System.out.println(hero);
        }

    }

    public static Hero[] createHeroes2() {
        Hero physical = new Hero(250, 2);
        Hero medic = new Hero(450, 0, "Treatment from Medic");
        Hero berserk = new Hero(50, 5, "BossDamage blocking");
        return new Hero[]{physical, medic, berserk};
    }

}



