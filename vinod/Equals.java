package vinod;

public class Equals {
	public static void main(String[]args) {
	String str1 = "Hello";
	String str2 = "Hello";
	String str3 = new String("Hello");

	System.out.println(str1.equals(str2)); 
	System.out.println(str1.equals(str3));
	System.out.println(str1 == str2); // Output: true (both refer to the same string literal in the string pool)
	System.out.println(str1 == str3);
}
}
