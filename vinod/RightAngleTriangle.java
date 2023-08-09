package vinod;

import java.util.Scanner;

public class RightAngleTriangle {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        displayRightAngleTriangle(rows);

        scanner.close();
    }

    public static void displayRightAngleTriangle(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
