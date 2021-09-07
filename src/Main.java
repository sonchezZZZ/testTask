import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger myFactorial = Mathematic.returnFactorial(100);
        System.out.println(Mathematic.getSumOfDigits(myFactorial));
    }


}
