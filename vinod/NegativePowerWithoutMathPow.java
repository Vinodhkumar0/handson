package vinod;

import java.util.Scanner;

public class NegativePowerWithoutMathPow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();

        System.out.print("Enter the negative exponent: ");
        int exponent = scanner.nextInt();

        double result = calculateNegativePower(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        scanner.close();
    }

    public static double calculateNegativePower(int base, int exponent) {
        double result = 1.0;

        for (int i = 1; i <= -exponent; i++) {
            result /= base;
        }

        return result;
    }
}
