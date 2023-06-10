package hw_3;

import java.util.Arrays;

public class Third_HW {

    public static void main(String[] args) {
         /* MAIN TASK:
    Create an array of fractional (non-integer) numbers of 15 elements and fill it with
    positive and negative numbers; Then, through the “for each” loop, calculate the arithmetic mean of positive numbers located after the first
    negative number and display it */

        // Additional Task 2
        double[] numbers = {1, 2, 1, -2,
                1, -2, 2, -2, 3, -2, 4, -2, 5, -2, 6};
        // 1+2+3+4+5+6=21/6=3.5

        System.out.println("The average of positive numbers after the first negative number in the list: "+ arithmeticMeanAfterFirstNegNum(numbers));


            /* ADDITIONAL TASK:
    You need to write the following ascending sorting algorithm: select each iteration
    the smallest element and offset it to the beginning. At the same time, each new iteration
    starts moving to the right, that is, the second pass - from the second, etc.
    And on each iteration, print out the current state of the array */

        System.out.println("__________");

        double[] numbers2 = new double[]{
                4.6, -54.7, 82.6, 4.73, -1.4, 3.8, 9.5, -478.9,
                2.9, 16.7, -4.9, -4.4, 467.7, 48.5, 5.3};
        ascendingSorting(numbers2);


    }


    public static double arithmeticMeanAfterFirstNegNum(double[] numbers) {
        double sum = 0;
        int count = 0;
        boolean negativeNum = false;

        for (double num : numbers) {
            if (!negativeNum && num < 0) {
                negativeNum = true;
                continue;
            }
            if (num > 0 && negativeNum) {
                sum += num;
                count++;
            }
        }
        return sum / count;
    }


    public static void ascendingSorting(double[] numbers) {

        System.out.println("Initial list: " + Arrays.toString(numbers));
        for (int i = 1; i < numbers.length; i++) {
            double currentNumber = numbers[i];
            int prevIndex = i - 1;
            while (prevIndex >= 0 && currentNumber < numbers[prevIndex]) {
                numbers[prevIndex + 1] = numbers[prevIndex];
                prevIndex--;
                numbers[prevIndex + 1] = currentNumber;
            }
            System.out.println("Cycle number " + i + " "  + Arrays.toString(numbers));
        }
    }
}
