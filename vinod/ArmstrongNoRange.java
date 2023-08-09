package vinod;

import java.util.Scanner;

public class ArmstrongNoRange {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();

        System.out.println("Armstrong numbers between " + lowerBound + " and " + upperBound + ":");
        findArmstrongNumbersInRange(lowerBound, upperBound);

        scanner.close();
    }

    public static void findArmstrongNumbersInRange(int lowerBound, int upperBound) {
        for (int num = lowerBound; num <= upperBound; num++) {
            if (isArmstrongNumber(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int sum = 0;
        int numOfDigits = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numOfDigits);
            num /= 10;
        }

        return sum == originalNum;
    }
}
