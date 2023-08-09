package vinod;

public class ArraySmallLarge {
	
	public static void main(String[] args) {
        int[] numbers = { 10, 5, 3, 8, 12, 7 };

        int smallest = findSmallestNumber(numbers);
        int largest = findLargestNumber(numbers);

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }

    public static int findSmallestNumber(int[] arr) {
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static int findLargestNumber(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}

