package vinod;

import java.util.Scanner;

public class DiagnallyPattern {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        printDiagonalStars(rows);

        scanner.close();
    }

    public static void printDiagonalStars(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars
            System.out.println("****");
        }
    }
}
