package vinod;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumbers = 10;
        int sum = 0;

        System.out.println("Enter " + totalNumbers + " integers:");

        for (int i = 0; i < totalNumbers; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            int number = scanner.nextInt();
            sum += number;
        }

        scanner.close();

        double average = (double) sum / totalNumbers;
        System.out.println("Average value: " + average);
    }
}


