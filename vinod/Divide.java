package vinod;

import java.util.Scanner;

public class Divide {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the number of equal parts to divide the string: ");
        int n = scanner.nextInt();

        String[] dividedParts = divideStringIntoEqualParts(inputString, n);
        System.out.println("Divided parts:");
        for (String part : dividedParts) {
            System.out.println(part);
        }

        scanner.close();
    }

    public static String[] divideStringIntoEqualParts(String str, int n) {
        int strLength = str.length();
        int partLength = strLength / n;
        int remainder = strLength % n;

        String[] dividedParts = new String[n];
        int startIndex = 0;

        for (int i = 0; i < n; i++) {
            int endIndex = startIndex + partLength + (i < remainder ? 1 : 0);
            dividedParts[i] = str.substring(startIndex, endIndex);
            startIndex = endIndex;
        }

        return dividedParts;
    }
}
