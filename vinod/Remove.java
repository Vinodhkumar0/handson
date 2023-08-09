package vinod;

public class Remove {
	public static String removeChars(String str1, String str2) {
        if (str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty()) {
            throw new IllegalArgumentException("Input strings should not be null or empty.");
        }

        // Create a StringBuilder to build the updated string
        StringBuilder result = new StringBuilder();

        // Create a boolean array to mark characters to be removed
        boolean[] removeChars = new boolean[128]; // Assuming ASCII characters

        // Mark characters from the second string to be removed
        for (char c : str2.toCharArray()) {
            removeChars[c] = true;
        }

        // Append characters from the first string to the result StringBuilder if they are not in the removeChars array
        for (char c : str1.toCharArray()) {
            if (!removeChars[c]) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "ol";
        String result = removeChars(str1, str2);
        System.out.println("After removing characters from the second string: " + result);
    }
}

