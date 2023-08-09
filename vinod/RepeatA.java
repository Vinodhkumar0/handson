package vinod;

import java.util.Scanner;

public class RepeatA {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        scanner.close();

        int countA = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'A') {
                countA++;
            }
        }

        System.out.println("Number of times 'a' appears: " + countA);
    }
}

