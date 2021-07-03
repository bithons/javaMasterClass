package academy.learnprogramming.helloWorld;

public class Hello {
    public static void main(String[] args) {
        // Printing some text (string)
        System.out.println("Hello Mert");

        // Declaring Statement: Creating a variable with the Primitive (data) type int.
        // There are 8 primitive data types in Java: boolean, byte, char, short, int, long, float and double
        // Given value to a variable is called an expression.
        int myFirstNumber = (2 * 10) + (5 + 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = 1000 - myTotal;
        // Java operators can be used as expression for variables, for example:
        int myFirstMath = (2 * 10) + (5 + 10);

        // Printing the value of 'myFirstNumber' variable out
        System.out.println(myFirstNumber);

        // Some (Not all) Java operators are: +, -, /, *

        // Printing the value of 'myFirstMath' variable out
        System.out.println(myFirstMath);

        // Printing the value of 'myTotal' variable out
        System.out.println(myTotal);

        // Printing the value of 'myLastOne' Variable out
        System.out.println(myLastOne);
    }
}
