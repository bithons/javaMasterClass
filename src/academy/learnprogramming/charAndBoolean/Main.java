package academy.learnprogramming.charAndBoolean;

public class Main {

    public static void main(String[] args) {
        // This variable is a character variable which can only hold 1 char
        char myChar = 'M';
        // \u tells Java Compiler that we are using unicode. 0044 is the code from the unicode table which is in this case
        // the char 'D'
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;
    }
}
