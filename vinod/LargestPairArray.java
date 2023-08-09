package vinod;

public class LargestPairArray {

	public static void main(String[] args) {
        int[] numbers = { 10, 5, 20, 15, 8, 25, 18 };

        int[] greatestPair = findGreatestPair(numbers);
        int largest = greatestPair[0];
        int secondLargest = greatestPair[1];

        System.out.println("Greatest pair: " + largest + " and " + secondLargest);
    }

    public static int[] findGreatestPair(int[] arr) {
        int[] greatestPair = new int[2];
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        greatestPair[0] = largest;
        greatestPair[1] = secondLargest;
        return greatestPair;
    }
}
