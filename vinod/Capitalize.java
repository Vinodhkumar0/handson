package vinod;

import java.util.Scanner;

public class Capitalize {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String modifiedString = capitalizeFirstLastCharacters(inputString);
        System.out.println("Modified string: " + modifiedString);

        scanner.close();
    }

    public static String capitalizeFirstLastCharacters(String str) {
        StringBuilder result = new StringBuilder();

        String[] words = str.split("\\s+");
        for (String word : words) {
            if (word.length() >= 2) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                char lastChar = Character.toUpperCase(word.charAt(word.length() - 1));
                result.append(firstChar).append(word.substring(1, word.length() - 1)).append(lastChar).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }

        return result.toString().trim();
    }
}

