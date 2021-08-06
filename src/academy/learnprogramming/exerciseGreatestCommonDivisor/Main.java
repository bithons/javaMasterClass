package academy.learnprogramming.exerciseGreatestCommonDivisor;

public class Main {
    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
//        int firstHighestDivisor = 0;
//        int secondHighestDivisor = 0;
        int minNumber = (first <= second) ? second : first;
        int gcd = 0;
//        int returnValue = 0;


//        for (int i = 1; i <= first; i++) {
//            if(first % i == 0) {
//                firstHighestDivisor = i;
//            }
//        }
//
//        for (int i = 1; i <= second; i++) {
//            if(second % i == 0) {
//                secondHighestDivisor = i;
//            }
//        }

        for (int i = 1; i <= minNumber; i++) {
            if ((first % i == 0) && (second % i == 0)) {
                gcd = i;
            }
        }

//        returnValue = (firstHighestDivisor >= secondHighestDivisor) ? firstHighestDivisor:secondHighestDivisor;

        if (first < 10 || second < 10) {
            gcd = -1;
        }

        return gcd;
    }
}
