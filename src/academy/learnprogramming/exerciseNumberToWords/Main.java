package academy.learnprogramming.exerciseNumberToWords;

public class Main {
    public static void main(String[] args) {
        numberToWords(10000);
        numberToWords(10);
        numberToWords(4);
    }

    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");
        int reversedNumber = reverse(number);
        String wordOfNumber = "";
        int totalDigits = getDigitCount(number);
        int reversedDdigits = getDigitCount(reversedNumber);

        if (number == 0) {
            wordOfNumber += "Zero";
        }

        while (reversedNumber > 0) {

            // Extracting the last digit of number
            int lastDigit = reversedNumber % 10; // 1
            // Converting last digit to word
            switch (lastDigit) {
                case 1:
                    wordOfNumber += "One ";
                    break;
                case 2:
                    wordOfNumber += "Two ";
                    break;
                case 3:
                    wordOfNumber += "Three ";
                    break;
                case 4:
                    wordOfNumber += "Four ";
                    break;
                case 5:
                    wordOfNumber += "Five ";
                    break;
                case 6:
                    wordOfNumber += "Six ";
                    break;
                case 7:
                    wordOfNumber += "Seven ";
                    break;
                case 8:
                    wordOfNumber += "Eight ";
                    break;
                case 9:
                    wordOfNumber += "Nine ";
                    break;
                case 0:
                    wordOfNumber += "Zero ";
                    break;
            }
            // Removing the last digit from number
            reversedNumber /= 10; // 1
        }

        for (int i = 0; (totalDigits - reversedDdigits) > i; i++) {
            wordOfNumber += "Zero ";
        }

        System.out.println(wordOfNumber);
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            // example number = 123
            int lastDigit = number % 10; // 3
            reverse = (reverse * 10) + lastDigit; // 0 * 10 + 3
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        int digitCounter = 1;
        while (number > 9) {
            digitCounter++;
            number /= 10;
        }
        return digitCounter;
    }
}
