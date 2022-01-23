public class LastDigitChecker {
    public static boolean isValid(int num) {
        return num > 9 && num < 1001;
    }

    public static boolean hasSameLastDigit(int numOne, int numTwo, int numThree) {

        // Gets the rightmost digit of each parameter
        if (isValid(numOne) && isValid(numTwo) && isValid(numThree)) {
            numOne %= 10;
            numTwo %= 10;
            numThree %= 10;

            return numOne == numTwo || numOne == numThree || numTwo == numThree;
        }

        return false;
    }
}
