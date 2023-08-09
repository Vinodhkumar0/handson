package vinod;

import java.util.Scanner;

public class ReverseWord {
	public static void main(String[]args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
		
		//String str="hello";
		String reverse=new StringBuilder(input).reverse().toString();	
		System.out.println("reversed word of "+input+ " is " +reverse);
	}

}
