package academy.learnprogramming.exerciseDigitSum;

public class Main {
    public static void main(String[] args) {

        System.out.println(sumDigits(125));
    }

    public static int sumDigits(int number) {

        if (number < 10) {
            return -1;
        }

        int sum = 0;
        int digit = 0;
        while (number > 0) {
            digit = number % 10;
            number /= 10;
            sum += digit;
        }
        return sum;
    }
}
