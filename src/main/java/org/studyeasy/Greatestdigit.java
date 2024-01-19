package org.studyeasy;
import java.util.Scanner;

public class Greatestdigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Find the greatest digit
        int greatestDigit = findGreatestDigit(number);

        // Display the result
        System.out.println("The greatest digit in the number is: " + greatestDigit);

        scanner.close();
    }

    // Function to find the greatest digit in a number
    private static int findGreatestDigit(long number) {
        // Handle negative numbers by converting to positive
        number = Math.abs(number);

        int greatestDigit = 0;

        while (number > 0) {
            int digit = (int) (number % 10);
            greatestDigit = Math.max(greatestDigit, digit);
            number /= 10;
        }

        return greatestDigit;
    }
}
