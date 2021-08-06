package academy.learnprogramming.exerciseNumberPalindrome;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        int lastDigit = 0; // extracting last digit eg 7
        int reverse = 0; // this will be 70 econd round
        number = Math.abs(number);
        int temp = number;

        while (temp > 0) {
            lastDigit = temp % 10;
            reverse = (reverse * 10) + lastDigit;
            temp /= 10;
        }

        return reverse == number;
    }
}
