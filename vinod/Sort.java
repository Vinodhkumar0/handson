package vinod;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
	 public static String sortLetters(String str) {
	        if (str == null || str.isEmpty()) {
	            throw new IllegalArgumentException("Input string is null or empty.");
	        }

	        char[] charArray = str.toLowerCase().toCharArray();
	        Arrays.sort(charArray);

	        return new String(charArray);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a name: ");
	        String name = scanner.nextLine();

	        scanner.close();

	        String sortedName = sortLetters(name);
	        System.out.println("Letters in ascending order: " + sortedName);
	    }
	}


