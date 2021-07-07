package academy.learnprogramming.exerciseSecondsAndMinutes;

public class Main {

    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";


    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-1));
    }

    public static String getDurationString(int minutes, int seconds) {
        String resultOfCalculation;
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;

            String hoursString = Integer.toString(hours);
            String minutesString = Integer.toString(remainingMinutes);
            String secondsString = Integer.toString(seconds);

            if (hours < 10) {
                hoursString = "0" + hoursString;
            } else if (minutes < 10) {
                minutesString = "0" + minutesString;
            } else if (seconds < 10) {
                secondsString = "0" + secondsString;
            }

            resultOfCalculation = hoursString + "h " + minutesString + "m " + secondsString + "s";
        } else {
            resultOfCalculation = INVALID_VALUE_MESSAGE;
        }
        return resultOfCalculation;
    }

    public static String getDurationString(int seconds) {
        String resultOfCalculation;
        if (seconds >= 0) {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            resultOfCalculation = getDurationString(minutes, remainingSeconds);
        } else {
            resultOfCalculation = INVALID_VALUE_MESSAGE;
        }
        return resultOfCalculation;
    }
}
