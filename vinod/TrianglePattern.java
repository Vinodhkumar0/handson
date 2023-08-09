package vinod;

import java.util.Scanner;

public class TrianglePattern {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of rows: ");
	        int rows = scanner.nextInt();

	        printPattern(rows);

	        scanner.close();
	    }

	    public static void printPattern(int numRows) {
	        for (int i = 1; i <= numRows; i++) {
	            // Print spaces
	            for (int j = 1; j <= numRows - i; j++) {
	                System.out.print(" ");
	            }

	            // Print first star
	            System.out.print("*");

	            // Print spaces between stars
	            for (int j = 1; j <= 2 * i - 3; j++) {
	                System.out.print(" ");
	            }

	            // Print last star (except for the last row)
	            if (i != 1) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }
	    }
	}
    