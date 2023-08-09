package vinod;

public class ArrayRotation {
	public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        int rotateLeftBy = 2;
        int rotateRightBy = 3;

        System.out.println("Original Array: ");
        printArray(numbers);

        int[] leftRotatedArray = rotateArrayLeft(numbers, rotateLeftBy);
        System.out.println("\nArray after left rotation by " + rotateLeftBy + ": ");
        printArray(leftRotatedArray);

        int[] rightRotatedArray = rotateArrayRight(numbers, rotateRightBy);
        System.out.println("\nArray after right rotation by " + rotateRightBy + ": ");
        printArray(rightRotatedArray);
    }

    public static int[] rotateArrayLeft(int[] arr, int rotateBy) {
        int n = arr.length;
        int[] rotatedArray = new int[n];
        for (int i = 0; i < n; i++) {
            int newIndex = (i + n - rotateBy) % n;
            rotatedArray[newIndex] = arr[i];
        }
        return rotatedArray;
    }

    public static int[] rotateArrayRight(int[] arr, int rotateBy) {
        int n = arr.length;
        int[] rotatedArray = new int[n];
        for (int i = 0; i < n; i++) {
            int newIndex = (i + rotateBy) % n;
            rotatedArray[newIndex] = arr[i];
        }
        return rotatedArray;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}