package academy.learnprogramming.exerciseLeapYear;

public class Main {

    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);
        isLeapYear(1924);
        isLeapYear(1800);
        // ADDED FOR GITHUB
    }

    public static boolean isLeapYear(int year) {
        boolean checkLeapYear = ((year >= 1 && year <= 9999) && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 )) ? true : false;
        System.out.println(checkLeapYear);
        return checkLeapYear;
    }
}
