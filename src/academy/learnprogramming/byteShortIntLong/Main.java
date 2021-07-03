package academy.learnprogramming.byteShortIntLong;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;

	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntvalue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntvalue);

        // This will cause underflow, it will change the value to Minimum
        System.out.println("Busted MAX Value = " + (myMaxIntvalue + 1));

        // This will cause overflow, it will change the value to Maximum
        System.out.println("Busted MIN Value = " + (myMinIntValue - 1));

        // We can write long numbers with underscore as separator, for example:
        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        // This data type is used if the number we want to use is larger or smaller then the max/min values of integer
        // If we assign a long value we should add uppercase L at the end of the value, for example:
        // If we don't assign the uppercase L at the end Java will threat it as a integer data type
        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        // A byte occupies 8 bits, a byte has a width of 8
        // A short occupies 16 bits, a short has a width of 16 bits
        // A int occupies 32 bits, a int has a width of 32 bits
        // A long occupies 64 bits, a long has a width of 64 bits



        // We will learn about casting here
        // Casting means converting a number from one type to another
        // Casting can be done by putting the data type you want to convert to in parentheses

        // The code below won't give any problems because myMinIntValue is an int data type and 2 is also int data type
        // This means dat we have an expression which is int / int results in int
        int myTotal = (myMinIntValue / 2);

        // When we look at this code we have byte data type divided by int data type this results in int which gives error
        // because myMinByteValue is not a int
        // To solve this problem we use casting
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        // Java uses int as default

        //Primitive Types Challenge
        byte myByteVariable = 1;
        short myShortVariable = 10;
        int myIntVariable = 100;

        long myLongVariable = 50000L + 10L * (myByteVariable + myShortVariable + myIntVariable);
        System.out.println(myLongVariable);
    }
}
