package academy.learnprogramming;

public class exercisePlayingCat {

    public static void main(String[] args) {
        isCatPlaying(true, 10);
        isCatPlaying(false, 36);
        isCatPlaying(false, 35);
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
//        boolean isCatPlayingAnswer = ((temperature < 25) && (summer == false && temperature > 35) || (summer == true && temperature > 45)) ? false : true;
//        System.out.println(isCatPlayingAnswer);
//        return isCatPlayingAnswer;
        int maxTemp = summer ? 45 : 35;
        System.out.println(temperature >= 25 && temperature <= maxTemp);
        return temperature >= 25 && temperature <= maxTemp;
//        System.out.println(temperature > 24 && temperature < 46 && summer == true || temperature > 24 && temperature < 36);
//        return temperature > 24 && temperature < 46 && summer || temperature > 24 && temperature < 36;
    }
}
