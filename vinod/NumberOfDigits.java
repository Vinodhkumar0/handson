package vinod;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int digitCount = countDigits(number);
        System.out.println("Number of digits in " + number + ": " + digitCount);

        scanner.close();
    }

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }
}
