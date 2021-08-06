package academy.learnprogramming.exerciseSharedDigit;

public class Main {
    public static void main(String[] args) {
        hasSharedDigit(12, 23);
        hasSharedDigit(9, 99);
        hasSharedDigit(15, 55);
    }

    public static boolean hasSharedDigit(int x, int y) {
        boolean returnValue = false;

        if (x >= 10 && x <= 99 && y >= 10 && y <= 99) {
            returnValue = (x / 10 == y / 10) || (x / 10 == y % 10) || (y / 10 == x % 10) || (y % 10 == x % 10);
        }
        return returnValue;
    }
}
