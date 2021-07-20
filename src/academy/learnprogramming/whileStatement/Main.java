package academy.learnprogramming.whileStatement;

public class Main {
    public static void main(String[] args) {
//        int count = 0;
//        while(count !=5) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        for(int i = 1; i<7; i++) {
//            System.out.println("Count value is " + i);
//        }
        int number = 4;
        int finishNumber = 20;
        int count = 0;
        while (number <= finishNumber) {

            number++;

            if (!isEvenNumber(number)) {
                continue;
            }
            count++;

            System.out.println("Even number " + number);

            if (count == 5) {
                break;
            }
        }

        System.out.println("Total even numbers found " + count);
    }

    public static boolean isEvenNumber(int number) {
        boolean numberIsEven = (number % 2) == 0;
        boolean returnValue;
        returnValue = numberIsEven;
        return returnValue;
    }
}
