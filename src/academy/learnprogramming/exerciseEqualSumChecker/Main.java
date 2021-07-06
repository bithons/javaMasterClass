package academy.learnprogramming.exerciseEqualSumChecker;

public class Main {

    public static void main(String[] args) {
        hasEqualSum(1, 1, 1);
        hasEqualSum(1, 1, 2);
        hasEqualSum(1, -1, 0);
    }

    public static boolean hasEqualSum(int firstNum, int secondNum, int thirdNum) {
        boolean isEqual = (firstNum + secondNum) == thirdNum;
        System.out.println(isEqual);
        return isEqual;
    }
}
