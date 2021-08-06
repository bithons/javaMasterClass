package academy.learnprogramming.exerciseDiagonalStar;

public class Main {
    public static void main(String[] args) {
        printSquareStar(10);
    }

    public static void printSquareStar(int number) {
        if (number < 5) System.out.println("Invalid Value");
        else {
            for (int row = 1; row <= number; row++) { //row
                for (int col = 1; col <= number; col++) { //column
                    if (row == 1 || row == number || col == 1 || col == number || row == col || row + col == number + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
