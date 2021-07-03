package academy.learnprogramming.exerciseBarkingDog;

public class Main {

    public static void main(String[] args) {
        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true,8);
        shouldWakeUp(true,-1);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean shouldWakeUp = (!barking || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay >= 8 && hourOfDay <= 22)) ? false : true;
        System.out.println(shouldWakeUp);
        return shouldWakeUp;
    }
}
