package vinod;

public class SecondLargest {
	 public static int findSecondLargest(int[] arr) {
	        if (arr == null || arr.length < 2) {
	            throw new IllegalArgumentException("Array should have at least two elements.");
	        }

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

	        return secondLargest;
	    }

	    public static void main(String[] args) {
	        int[] array = { 10, 5, 20, 8, 15, 12 };

	        int secondLargest = findSecondLargest(array);

	        System.out.println("Second largest number in the array: " + secondLargest);
	    }
	}
