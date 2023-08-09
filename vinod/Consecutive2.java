package vinod;

public class Consecutive2 {
	public static int findSmallestSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input array is empty or null.");
        }

        int smallestSum = Integer.MAX_VALUE;
        int currentSum = 0;

        for (int num : nums) {
            currentSum += num;
            if (currentSum < smallestSum) {
                smallestSum = currentSum;
            }
            if (currentSum > 0) {
                currentSum = 0;
            }
        }

        return smallestSum;
    }

    public static void main(String[] args) {
        int[] nums = { 3, -4, 2, -3, -1, 7, -6 };
        int smallestSum = findSmallestSum(nums);
        System.out.println("The smallest sum of consecutive numbers is: " + smallestSum);
    }
}

