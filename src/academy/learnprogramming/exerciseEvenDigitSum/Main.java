package academy.learnprogramming.exerciseEvenDigitSum;

public class Main {
    public static void main(String[] args) {
        getEvenDigitSum(123456789);
        getEvenDigitSum(252);
        getEvenDigitSum(-22);
    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        if (number < 0) {
            sum = -1;
        }

        while (number > 0) {
            int lastDigit = number % 10;
            boolean digitIsEven = (lastDigit % 2 == 0);
            if (digitIsEven) {
                sum += lastDigit;
            }
            number /= 10;
        }
        return sum;
    }
}
