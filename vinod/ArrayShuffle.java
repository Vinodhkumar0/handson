package vinod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArrayShuffle {

	    public static void main(String[] args) {
	        Integer[] array = { 1, 2, 3, 4, 5 };
	        
	        // Convert the array to a list
	        List<Integer> list = new ArrayList<>(Arrays.asList(array));

	        // Shuffle the list using Collections.shuffle()
	        Collections.shuffle(list);

	        // Convert the list back to an array
	        array = list.toArray(new Integer[0]);

	        // Print the shuffled array
	        System.out.println("Shuffled array: " + Arrays.toString(array));
	        System.out.println("Shuffled array: " + java.util.Arrays.toString(array));
	    }
	
	//Implementing a custom shuffling algorithm for primitive arrays (e.g., int[]):
	

public static void shuffleArray(int[] arr) {
    Random random = new Random();

    for (int i = arr.length - 1; i > 0; i--) {
        int index = random.nextInt(i + 1);

        // Swap elements at index i and index
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }
}
}