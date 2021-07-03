package academy.learnprogramming.strings;

public class Main {

    public static void main(String[] args) {
        // list of 8 primitive data types:
	    // byte 1 byte consisting of 8 bits
        // short 2 byte consisting of 16 bits
        // int 4 byte consisting of 32 bits (standard used)
        // long 64 bits consisting of 64 bits
        // double 8 byte consisting of 32 bits (standard used)
        // float 4 byte consisting of 32 bits
        // boolean 1 bit
        // char 2 bytes consisting of 16 bits

        // string is not a primitive data type, string is in fact a class,
        // string is a sequence of characters
        // string is technically limited by memory or MAX_VALUE which is 2.14 billion chars

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + " And this is more.";
        // We can use + sign to append strings.
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        // LastString is String variable. myInt is a integer variable.
        // in the example below Java converts the value of myInt to String
        // this is because Java knows that lastString is String variable
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);

        // String in Java are immutable, this means you can't change a String after it's created
        // when we modify a string, a new String is created by Java.

        // Appending strings is not recommended because it will create Java strings are immutable and will create
        // new strings. Appending strings method is not recommended, because it is ineffcient.

    }
}
