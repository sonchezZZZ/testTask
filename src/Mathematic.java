import java.math.BigInteger;

public class Mathematic {


    public static BigInteger returnFactorial(int number) { // create recursive method for find Factorial
        if (number <= 1) { // when number in recurse equals 1 or less 1
            return BigInteger.valueOf(1);  // finish recurse
        } else {
            BigInteger nextStep = BigInteger.valueOf(number).multiply(returnFactorial(number - 1));  //action for next step
            return nextStep; // entering into the next step of the recursion
        }
    }

    //      method for third task, which returns sum of digits in a number
    public static int getSumOfDigits(BigInteger number) {
        int sum =0;  // create variable to count digits of number
        for (char i: number.toString().toCharArray()) {  // loop for count sum of digits. The list is a list of characters derived from the  BigInteger type
            int nextDigit = Character.getNumericValue(i);  // variable  was translated from character  to Integer
            sum = sum+ nextDigit;   // add next Digit to sum
        }
        return sum;
    }


}
