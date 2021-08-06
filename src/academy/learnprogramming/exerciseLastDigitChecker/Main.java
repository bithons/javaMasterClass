package academy.learnprogramming.exerciseLastDigitChecker;

public class Main {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (isValid(x) && isValid(y) && isValid(z)) {
            x %= 10;
            y %= 10;
            z %= 10;
            return (x == y) || (x == z) || (z == y);
        } else {
            return false;
        }
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}
