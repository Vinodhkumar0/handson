package vinod;

import java.util.Scanner;

public class DiamondPattern {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (should be an odd number): ");
        int rows = scanner.nextInt();

        if (rows % 2 == 0) {
            System.out.println("Number of rows should be an odd number.");
        } else {
            printDiamondPattern(rows);
        }

        scanner.close();
    }

    public static void printDiamondPattern(int numRows) {
        int midRow = numRows / 2;
        int starCount = 1;

        // Upper half of the diamond
        for (int i = 0; i < midRow; i++) {
            for (int j = 0; j < midRow - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }

            System.out.println();
            starCount += 2;
        }

        // Middle row
        for (int i = 0; i < starCount; i++) {
            System.out.print("*");
        }

        System.out.println();

        // Lower half of the diamond
        starCount -= 2;
        for (int i = 0; i < midRow; i++) {
            for (int j = 0; j <= i + 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }

            System.out.println();
            starCount -= 2;
        }
    }
}
