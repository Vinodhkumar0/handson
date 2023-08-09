package vinod;

public class Permutations {
	public static void printPermutations(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input string should not be null or empty.");
        }

        printPermutationsHelper("", str);
    }

    private static void printPermutationsHelper(String prefix, String remaining) {
        int n = remaining.length();

        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                printPermutationsHelper(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1));
            }
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println("All permutations of the string " + str + ":");
        printPermutations(str);
    }
}


