package vinod;

public class ArrayEvenOdd {
	public static void main(String[] args) {
        int[] numbers = { 10, 5, 3, 8, 12, 7 };

        int evenCount = countEvenNumbers(numbers);
        int oddCount = countOddNumbers(numbers);

        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }

    public static int countEvenNumbers(int[] arr) {
        int evenCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }

    public static int countOddNumbers(int[] arr) {
        int oddCount = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount;
    }
}
