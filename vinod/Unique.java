package vinod;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Unique {
	public static Set<Character> findUniqueCharacters(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input string is null or empty.");
        }

        Set<Character> uniqueChars = new HashSet<>();
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Count the frequency of each character in the string
        for (char c : str.toCharArray()) {
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the unique characters with a frequency of 1
        for (char c : str.toCharArray()) {
            if (charFrequencyMap.get(c) == 1) {
                uniqueChars.add(c);
            }
        }

        return uniqueChars;
    }

    public static void main(String[] args) {
        String inputString = "hello world";

        Set<Character> uniqueChars = findUniqueCharacters(inputString);

        System.out.println("The unique characters in the string are: " + uniqueChars);
    }
}

