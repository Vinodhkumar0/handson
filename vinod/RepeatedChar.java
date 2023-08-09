package vinod;

import java.util.HashMap;

public class RepeatedChar {
	public static void printRepeatedCharacters(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("Input string is null or empty.");
            return;
        }

        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();

        // Count the frequency of each character in the string
        for (char c : str.toCharArray()) {
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }

        // Print the characters with a frequency greater than 1 (repeated characters)
        System.out.print("Repeated characters in the string: ");
        for (char c : charFrequencyMap.keySet()) {
            if (charFrequencyMap.get(c) > 1) {
                System.out.print(c + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String inputString = "hello world hello";

        printRepeatedCharacters(inputString);
    }
}


