package vinod;

import java.util.Arrays;

public class Anagram {
	public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false; // Anagrams cannot be checked for null strings
        }

        if (str1.length() != str2.length()) {
            return false; // Anagrams should have the same length
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort both character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Check if the sorted arrays are equal
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println("The strings '" + str1 + "' and '" + str2 + "' are anagrams.");
        } else {
            System.out.println("The strings '" + str1 + "' and '" + str2 + "' are not anagrams.");
        }
    }


}
