package academy.learnprogramming.exerciseSumOdd;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));

    }

    public static boolean isOdd(int number) {
        return (number > 0) && (number % 2 != 0);
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if ((start < 1) || (end < 1) || (end < start)) {
            sum = -1;
        } else {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
        }
        return sum;
    }


}
