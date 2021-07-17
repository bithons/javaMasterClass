package academy.learnprogramming.exerciseNumberOfDaysMonth;

public class Main {
    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);

        getDaysInMonth(1, 2020);
        getDaysInMonth(2, 2020);
        getDaysInMonth(2, 2018);
        getDaysInMonth(-1, 2020);
        getDaysInMonth(1, -2020);
    }

    public static boolean isLeapYear(int year) {
        boolean returnValue;
        boolean isLeapYear = (year >= 1 && year <= 9999) && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
        //            System.out.println("returnvalue = " + returnValue);
        //            System.out.println("returnvalue = " + returnValue);
        returnValue = isLeapYear == true;

        return returnValue;
    }

    public static int getDaysInMonth(int month, int year) {
        int returnValue;
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            returnValue = -1;
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    returnValue = 31;
                    break;
                case 2:
                    returnValue = (isLeapYear(year) == true) ? 29 : 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    returnValue = 30;
                    break;
                default:
                    returnValue = -1;
                    break;
            }
        }
        System.out.println("month = " + month + " and year = " + year + " amount of days = " + returnValue);
        return returnValue;
    }
}
