package vinod;

import java.util.Scanner;

public class Repeated {
	public static int countCharacterFrequency(String str, char targetChar) {
        int frequency = 0;

        for (char c : str.toCharArray()) {
            if (c == targetChar) {
                frequency++;
            }
        }

        return frequency;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character you want to count: ");
        char targetChar = scanner.next().charAt(0);

        scanner.close();

        int charFrequency = countCharacterFrequency(inputString, targetChar);
        System.out.println("The character '" + targetChar + "' is repeated " + charFrequency + " times in the string.");
    }
}



