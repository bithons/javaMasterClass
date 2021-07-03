package academy.learnprogramming.excersiseSpeedConverter;

public class Main {

    public static void main(String[] args) {
	    printConversion(95.75);
    }

//    public class SpeedConverter {
        public static long toMilesPerHour(double kilometersPerHour) {
            double calculation = Math.round((kilometersPerHour / 1.609d));
            long convertedKilometersPerHour = (long)calculation;
            long milesPerHour;

            if(kilometersPerHour < 0) {
                milesPerHour = -1;
            } else {
                milesPerHour = convertedKilometersPerHour;
            }

            return milesPerHour;
        }
        public static void printConversion (double kilometersPerHour) {
            double kilometersToMilesConversion = toMilesPerHour(kilometersPerHour);
            if(kilometersToMilesConversion < 0) {
                System.out.println("Invalid Value");
            } else {
                System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
            }


        }

//    }
}
