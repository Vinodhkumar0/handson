package vinod;

import java.util.Scanner;

public class PrimeFactor {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Prime factors of " + number + ":");
        findPrimeFactors(number);

        scanner.close();
    }

    public static void findPrimeFactors(int number) {
        if (number <= 1) {
            return;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }

        // If the remaining number is greater than 1, it is also a prime factor
        if (number > 1) {
            System.out.print(number);
        }
    }
}
