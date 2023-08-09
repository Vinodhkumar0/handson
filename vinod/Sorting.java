package vinod;

public class Sorting {
	public static void main(String[] args) {
        int[] originalArray = { 5, 2, 9, 1, 5, 6 };
        int[] sortedArray = sortArray(originalArray);

        System.out.println("Original Array:");
        printArray(originalArray);

        System.out.println("\nSorted Array:");
        printArray(sortedArray);

        int[] copiedArray = copyArray(originalArray);

        System.out.println("\nCopied Array:");
        printArray(copiedArray);
    }

    public static int[] sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] copyArray(int[] source) {
        int n = source.length;
        int[] destination = new int[n];
        for (int i = 0; i < n; i++) {
            destination[i] = source[i];
        }
        return destination;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

