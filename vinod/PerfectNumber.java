package vinod;

public class PerfectNumber {
	public static void main(String[] args) {
        int number = 28; // Change this to check for different numbers

        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }

    public static boolean isPerfectNumber(int num) {
        int sumOfDivisors = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
            }
        }

        return sumOfDivisors == num;
    }
}
