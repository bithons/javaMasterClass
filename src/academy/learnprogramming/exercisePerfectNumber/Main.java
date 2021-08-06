package academy.learnprogramming.exercisePerfectNumber;

public class Main {
    public static void main(String[] args) {
        isPerfectNumber(6);
        isPerfectNumber(28);
        isPerfectNumber(5);
        isPerfectNumber(-1);
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        boolean returnValue = false;

        if (number < 1) return false;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }

        return sum == number;
    }
}
