package hw_2;

public class Second_HW {
    public static void main(String[] args) {

        System.out.println(walk(25, 29));
        System.out.println(walk(30, 38));
        System.out.println(walk(19, 15));
        System.out.println(walk(13, 40));
        System.out.println(walk(46, -25));

        // Additional Task 1
        System.out.println(walk(generateRandomAge(), 23));
        System.out.println(walk(generateRandomAge(), 35));
    }

    public static String walk(int age, int temp) {

        String info = String.format("Age: %d Temperature: %d ", age, temp);
        String canGo = "You can go for a walk";
        String stayHome = "Please, stay home";

        if ((age >= 20 && age <= 45) && (temp >= -20 && temp <= 30))
            return info + canGo;
        else if (age < 20 && temp >= 0 && temp <= 28)
            return info + canGo;
        else if (age > 45 && temp >= -10 && temp <= 25)
            return info + canGo;
        else
            return info + stayHome;

    }

    public static int generateRandomAge() {
        return (int) (Math.random() * 95);
    }



}
