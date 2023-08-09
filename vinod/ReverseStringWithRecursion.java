package vinod;

import java.util.Scanner;

public class ReverseStringWithRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String reversedString = reverseStringWithRecursion(inputString);
        System.out.println("Reversed String: " + reversedString);

        scanner.close();
    }

    public static String reverseStringWithRecursion(String input) {
        if (input.isEmpty()) {
            return input;
        } else {
            return reverseStringWithRecursion(input.substring(1)) + input.charAt(0);
        }
    }
}

