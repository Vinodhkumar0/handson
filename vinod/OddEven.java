package vinod;

public class OddEven {
	public static void main(String[] args) {
        int[] numbers = { 10, 5, 7, 12, 3, 8, 9, 15 };

        System.out.println("Even numbers:");
        printEvenNumbers(numbers);

        System.out.println("\nOdd numbers:");
        printOddNumbers(numbers);
    }

    public static void printEvenNumbers(int[] arr) {
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void printOddNumbers(int[] arr) {
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}