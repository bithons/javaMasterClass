package academy.learnprogramming.methodOverloading;

public class Main {

    public static void main(String[] args) {
//        calcFeetAndInchesToCentimeters(2,1);
        calcFeetAndInchesToCentimeters(157);
    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inch) {
        double calculation = (feet >= 0 && inch >= 0 && inch <= 12) ? ((feet * 30.48d) + (inch * 2.54d)) : -1d;
//        System.out.println(calculation);
        return calculation;
    }

    public static double calcFeetAndInchesToCentimeters(double inch) {
        double inchToFeetCalc = (inch >= 0) ? calcFeetAndInchesToCentimeters((int) (inch / 12), (inch % 12)) : -1d;
        System.out.println(Math.round((int) (inch / 12)));
        System.out.println(inch % 12);
        System.out.println(inchToFeetCalc);
        return inchToFeetCalc;
    }
}
