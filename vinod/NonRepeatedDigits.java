package vinod;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedDigits {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 2, 4, 5, 6, 5, 7, 8, 9, 8, 10 };

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each digit in the array
        for (int digit : array) {
            frequencyMap.put(digit, frequencyMap.getOrDefault(digit, 0) + 1);
        }

        // Print only the not-repeated digits
        System.out.print("Not-repeated digits in the array: ");
        for (int digit : array) {
            if (frequencyMap.get(digit) == 1) {
                System.out.print(digit + " ");
            }
        }
    }
}
