package academy.learnprogramming.exerciseTeenNumberChecker;

public class Main {
    public static void main(String[] args) {
        hasTeen(9, 99, 19);
        hasTeen(23, 15, 42);
        hasTeen(22, 23, 34);
    }

    public static boolean hasTeen(int ageOne, int ageTwo, int ageThird) {
        boolean checkIfHasTeen = isTeen(ageOne) || isTeen(ageTwo) || isTeen(ageThird);
        System.out.println(checkIfHasTeen);
        return checkIfHasTeen;
    }

    public static boolean isTeen(int age) {
        boolean checkIfIsTeen = age >= 13 && age <= 19;
        return checkIfIsTeen;
    }
}
