package vinod;

import java.util.Scanner;

public class Reverse {
    public static boolean areStringsReverse(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false; 
       // Strings cannot be reverse if they have different lengths or are null
        }

        int len = str1.length();
        for (int i = 0; i < len; i++) {
            if (str1.charAt(i) != str2.charAt(len - 1 - i)) {
                return false; 
      // If characters don't match, strings are not reverse of each other
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        scanner.close();

        if (areStringsReverse(str1, str2)) {
            System.out.println("The strings are reverse of each other.");
        } else {
            System.out.println("The strings are not reverse of each other.");
        }
    }
}


