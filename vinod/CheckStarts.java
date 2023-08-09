package vinod;

import java.util.Scanner;

public class CheckStarts {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        boolean startsWith = checkStartsWith(firstString, secondString);

        if (startsWith) {
            System.out.println("The first string starts with the contents of the second string.");
        } else {
            System.out.println("The first string does not start with the contents of the second string.");
        }

        scanner.close();
    }

    public static boolean checkStartsWith(String firstStr, String secondStr) {
        return firstStr.startsWith(secondStr);
    }
}
