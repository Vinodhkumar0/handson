package vinod;

import java.util.Scanner;

public class PowerWithoutMathPow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        int result = calculatePower(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        scanner.close();
    }

    public static int calculatePower(int base, int exponent) {
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        return result;
    }
}

