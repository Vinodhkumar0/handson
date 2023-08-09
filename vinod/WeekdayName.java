package vinod;

import java.util.Scanner;

public class WeekdayName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userNumber = scanner.nextInt();

        if (userNumber < 1 || userNumber > 7) {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        } else {
            String weekdayName = getWeekdayName(userNumber);
            System.out.println("Weekday: " + weekdayName);
        }

        scanner.close();
    }

    public static String getWeekdayName(int number) {
        String weekdayName;
        switch (number) {
            case 1:
                weekdayName = "Sunday";
                break;
            case 2:
                weekdayName = "Monday";
                break;
            case 3:
                weekdayName = "Tuesday";
                break;
            case 4:
                weekdayName = "Wednesday";
                break;
            case 5:
                weekdayName = "Thursday";
                break;
            case 6:
                weekdayName = "Friday";
                break;
            case 7:
                weekdayName = "Saturday";
                break;
            default:
                weekdayName = "Unknown";
        }
        return weekdayName;
    }
}

