package academy.learnprogramming.forStatement;

public class Main {
    public static void main(String[] args) {
        // Calculating the interest rate with a for loop
        for (int i = 2; i < 9; i++) {
            System.out.println(String.format("%.2f", calculateInterest(10000, i)));
        }

        for (int i = 8; i > 1; i--) {
            System.out.println(String.format("%.2f", calculateInterest(10000, i)));
        }

        int primeNumbersFound = 0;
        for (int i = 10; i < 50; i++) {
//            System.out.println(i);
            if (isPrime(i) == true) {
                System.out.println(i + " is a prime number");
                primeNumbersFound++;
            } else if (primeNumbersFound == 3) {
                break;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
