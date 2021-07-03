package academy.learnprogramming.exerciseMegaBytesConverter;

public class Main {

    public static void main(String[] args) {
	    printMegaBytesAndKiloBytes(5000);
        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int kiloBytesRemainder = kiloBytes % 1024;
            // Java uses here integer division; the result is truncated this means that the fractional part is thrown away
            // and not is rounded to the closest integer.
            int megaBytes = kiloBytes / 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytesRemainder + " KB");
        }
    }
}
