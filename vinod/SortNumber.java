package vinod;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumber {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        scanner.close();

        char[] digits = input.toCharArray();
        Arrays.sort(digits);
        String sortedInput = new String(digits);

        System.out.println("Sorted input in ascending order: " + sortedInput);
    }
}
