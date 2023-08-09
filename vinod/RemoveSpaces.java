package vinod;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with spaces: ");
        String inputString = scanner.nextLine();

        String stringWithoutSpaces = removeSpaces(inputString);
        System.out.println("String without spaces: " + stringWithoutSpaces);

        scanner.close();
    }

    public static String removeSpaces(String str) {
        return str.replaceAll(" ", "");
    }
}
