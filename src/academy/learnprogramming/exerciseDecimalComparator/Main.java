package academy.learnprogramming.exerciseDecimalComparator;

public class Main {

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.175, 3.176);
        areEqualByThreeDecimalPlaces(3.0, 3.0);
        areEqualByThreeDecimalPlaces(-3.123, 3.123);
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstDouble, double secondDouble) {
        boolean calculation = ((int) (firstDouble * 1000)) == ((int) (secondDouble * 1000));
        System.out.println(calculation);
        return calculation;
    }
}
