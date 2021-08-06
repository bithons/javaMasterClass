package academy.learnprogramming.exerciseFirstAndLastDigitSum;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {

        int sum = 0;

        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10; // 2
        while (number > 9) {
            number /= 10;
        }
        return number + lastDigit;
    }
}
