package vinod;

import java.util.Arrays;

public class Merge {
	public static void main(String[] args) {
        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 4, 5, 6 };

        int[] mergedArray = mergeArrays(array1, array2);

        System.out.println("Merged Array:");
        System.out.println(Arrays.toString(mergedArray));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        int[] mergedArray = new int[length1 + length2];

        // Copy elements of arr1 to the merged array
        System.arraycopy(arr1, 0, mergedArray, 0, length1);

        // Copy elements of arr2 to the merged array
        System.arraycopy(arr2, 0, mergedArray, length1, length2);

        return mergedArray;
    }
}

