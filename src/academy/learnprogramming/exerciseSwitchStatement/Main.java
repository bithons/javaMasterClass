package academy.learnprogramming.exerciseSwitchStatement;

public class Main {
    public static void main(String[] args) {
        // Let's create an if statement, nothing special.

//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value is 1");
//        } else if (value == 2) {
//            System.out.println("Value is 2");
//        } else {
//            System.out.println("Value is not equal to 1 or 2");
//        }

        // Now let's create an alternative for the code above.
        // I am creating an alternative because the if statement can get very long
        // this means it will look chaotic
        // Let's create an switch statement as an alternative:

        int switchValue = 3;
        switch (switchValue) {
            case 1: // If the value == 1
                System.out.println("Value is 1");
                break;

            case 2: // if the value == 2
                System.out.println("Value is 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Value was 3, 4 or 5");
                System.out.println("Value is " + switchValue);
                break;

            default: // If the value is not equal to 1 or 2, everything else
                System.out.println("Value is not equal to 1 or 2");
                break;
        }

        // Challenge
        char charSwitchValue = 'A';
        switch (charSwitchValue) {
            case 'a':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("A, B, C, D, or E is found");
                System.out.println("The found value is " + charSwitchValue);
                break;

            default:
                System.out.println("Not found");
                break;
        }

        String month = "July";
        switch (month.toLowerCase()) {
            case "july":
                System.out.println("It is July");
                break;
        }

    }
}
