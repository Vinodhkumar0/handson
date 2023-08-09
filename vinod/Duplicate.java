package vinod;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Duplicate {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        Map<Character, Integer> charCountMap = countDuplicates(inputString);

        System.out.println("Duplicates in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char character = entry.getKey();
            int count = entry.getValue();
            if (count > 1) {
                System.out.println(character + " - " + count + " occurrences");
            }
        }
        scanner.close();
    }

    public static Map<Character, Integer> countDuplicates(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        return charCountMap;
    }
}
