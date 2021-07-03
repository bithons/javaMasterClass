package academy.learnprogramming.floatAndDouble;

public class Main {

    public static void main(String[] args) {
        // Float occupies 4 bytes which means a width of 32 bits
        // Double occupies 8 bytes which means a widht of 64 bits
        // Double is the standard in Java
        // Double should always be used instead of float, float is exceptional

	    float myMaxFloatValue = Float.MAX_VALUE;
	    float myMinFloatValue = Float.MIN_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        double myMaxDoubleValue = Double.MAX_VALUE;
        double myMinDoubleValue = Double.MIN_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        int myIntValue = 10;

        // By adding 'f' or 'd'  at the end we indicate which data type should be used
        float myFloatValue = 5.25f;
        double myDoubleValue = 5.25d;

        System.out.println(myFloatValue);

        // Challenge
        double myPounds = 200d;
        double myPoundsToKilo = myPounds * 0.45359237d;
        System.out.println(myPoundsToKilo);
    }
}
