package academy.learnprogramming.exerciseAreaCalculator;

public class Main {

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }

    public static double area(double radius) {
        double areaCalculation;
        if (radius < 0) {
            areaCalculation = -1;
        } else {
            areaCalculation = (radius * radius * Math.PI);
        }
        return areaCalculation;
    }

    public static double area(double x, double y) {
        double areaCalculation;
        if (x < 0 || y < 0) {
            areaCalculation = -1;
        } else {
            areaCalculation = x * y;
        }
        return areaCalculation;
    }
}
