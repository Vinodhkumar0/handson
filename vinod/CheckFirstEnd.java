package vinod;

import java.util.Scanner;

public class CheckFirstEnd {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        boolean areFirstTwoAtEnd = checkFirstTwoAtEnd(inputString);
        if (areFirstTwoAtEnd) {
            System.out.println("The first two characters are present at the end of the string.");
        } else {
            System.out.println("The first two characters are not present at the end of the string.");
        }

        scanner.close();
    }

    public static boolean checkFirstTwoAtEnd(String str) {
        if (str.length() < 2) {
            return false;
        }

        String firstTwoCharacters = str.substring(0, 2);
        String lastTwoCharacters = str.substring(str.length() - 2);

        return firstTwoCharacters.equals(lastTwoCharacters);
    }
}
