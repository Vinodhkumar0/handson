package vinod;

import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of rows: ");
    int rows = scanner.nextInt();

    printCharacterPyramid(rows);

    scanner.close();
}

public static void printCharacterPyramid(int numRows) {
    int totalChars = 65; // ASCII value for 'A'

    for (int i = 1; i <= numRows; i++) {
        // Print spaces
        for (int j = 1; j <= numRows - i; j++) {
            System.out.print(" ");
        }

        // Print characters in ascending order
        for (int j = 1; j <= i; j++) {
            char ch = (char) totalChars;
            System.out.print(ch + " ");
            totalChars++;
        }

        // Print characters in descending order
        totalChars -= 2; // Decrease by 2 to move to the previous character
        for (int j = 1; j < i; j++) {
            char ch = (char) totalChars;
            System.out.print(ch + " ");
            totalChars--;
        }

        System.out.println();
    }
}
}
