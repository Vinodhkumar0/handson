package vinod;

import java.util.Arrays;

public class CheckElements {

	public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 3, 2, 1, 5, 4 };

        boolean haveSameElements = checkSameElements(array1, array2);

        if (haveSameElements) {
            System.out.println("Both arrays have the same elements.");
        } else {
            System.out.println("Arrays do not have the same elements.");
        }
    }

    public static boolean checkSameElements(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        int[] sortedArray1 = Arrays.copyOf(arr1, arr1.length);
        int[] sortedArray2 = Arrays.copyOf(arr2, arr2.length);

        Arrays.sort(sortedArray1);
        Arrays.sort(sortedArray2);

        return Arrays.equals(sortedArray1, sortedArray2);
    }
}
