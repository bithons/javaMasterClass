package academy.learnprogramming.exerciseLargestPrime;

public class Main {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        int i;

        for (i = 2; i <= number; i++) { // starting from 2
            if (number % i == 0) { // if no remainder then pass
                number /= i; // We divide the number because it is dividble
                i--;
            }
        }
        return i;
    }
}
