package hw_1;

import java.util.Scanner;

public class First_HW {
    public static void main(String[] args) {

   /* MAIN TASK:
        - Declare a variable of a String type, the name of which consists of several words.
        - Create a constant "NUM" of int type and set any value to it.
        - Create a variable “word” of a String type with any value.
        - Set the value of the variable declared at the very beginning, which would consist
        of the result of the concatenation the constants "NUM" and the variable "word".
        - Display the value of all variables on one line */

        String worldBestPlaces;
        final int NUM = 12;
        String word = " the best countries to live. ";
        worldBestPlaces = NUM + word;
        System.out.println(worldBestPlaces);


        /* - Add a conditional construction that would display the following: if the value
         of the constant “NUM” less than zero - “You have stored a negative number”,
         if the value is greater than zero - “You have saved a positive number ",
         otherwise - "You have stored zero"*/

        if (NUM > 0) {
            System.out.println("You've saved a positive number");
        } else if (NUM < 0) {
            System.out.println("You've saved a negative number");
        } else {
            System.out.println("You've have stored zero");
        }


        /* Additional Task:
        Make the program print to the console the line "Enter your name:"
        Then read the username entered from the keyboard
        and at the end greet the user by name */

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = in.nextLine();
        System.out.print("Hello, " + name + ". How can I help you?");
    }
}