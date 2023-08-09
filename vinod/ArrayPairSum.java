package vinod;

import java.util.HashMap;
import java.util.Map;

public class ArrayPairSum {


	public static void main(String[] args) {
        int[] array = { 2, 4, 3, 5, 7, 8, 9 };
        int targetSum = 12;

        findPairsWithSum(array, targetSum);
    }

    public static void findPairsWithSum(int[] arr, int targetSum) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = targetSum - arr[i];
            if (map.containsKey(complement)) {
                int index = map.get(complement);
                System.out.println("Pair found: " + arr[index] + " and " + arr[i]);
            }
            map.put(arr[i], i);
        }
    }
}
