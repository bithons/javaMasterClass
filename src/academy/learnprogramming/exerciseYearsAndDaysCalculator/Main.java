package academy.learnprogramming.exerciseYearsAndDaysCalculator;

public class Main {

    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
        } else {
            long minutesToHours = minutes / 60;
            long hoursToDays = minutesToHours / 24;
            long daysToYears = hoursToDays / 365;
            long remainingDays = hoursToDays % 365;
//            long remainingHours = minutesToHours % 60;

            System.out.println(minutes + " min = " + daysToYears + " y and " + remainingDays + " d");
        }
    }
}
