package vinod;

import java.util.Scanner;

public class VowelsConsonants {
	 public static void countVowelsAndConsonants(String str) {
	        if (str == null || str.isEmpty()) {
	            System.out.println("Input string is null or empty.");
	            return;
	        }

	        int vowelCount = 0;
	        int consonantCount = 0;

	        str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive comparison

	        for (char c : str.toCharArray()) {
	            if (c >= 'a' && c <= 'z') {
	                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                    vowelCount++;
	                } else {
	                    consonantCount++;
	                }
	            }
	        }

	        System.out.println("Number of vowels: " + vowelCount);
	        System.out.println("Number of consonants: " + consonantCount);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();

	        scanner.close();

	        countVowelsAndConsonants(inputString);
	    }
	}


