package vinod;

import java.util.Scanner;

public class Sumofevenandodd {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of integers: ");
	        int n = scanner.nextInt();

	        int sumEven = 0;
	        int sumOdd = 0;

	        System.out.println("Enter " + n + " integers:");

	        for (int i = 0; i < n; i++) {
	            int number = scanner.nextInt();
	            if (number % 2 == 0) {
	                sumEven += number;
	            } else {
	                sumOdd += number;
	            }
	        }

	        scanner.close();

	        System.out.println("Sum of even integers: " + sumEven);
	        System.out.println("Sum of odd integers: " + sumOdd);
	    }
	}

