import java.math.BigInteger;

public class BinaryExpoModBigInt {
    static BigInteger power_calc(BigInteger a, BigInteger b, BigInteger prime) {
        BigInteger result = new BigInteger("1");
        while(b.compareTo(BigInteger.ZERO) > 0) {
            if(b.and(BigInteger.ONE).compareTo(BigInteger.ZERO) != 0) {
                result = result.multiply(a);
                // result = result.mod(prime);
            }
            // a = a.multiply(a).mod(prime);
            a = a.multiply(a);
            b = b.shiftRight(1);
        }
        return result;
    }
    public static void main(String[] args) {
        BigInteger a = new BigInteger("2");
        BigInteger b = new BigInteger("100");
        BigInteger prime = new BigInteger(String.valueOf((int)Math.pow(10, 9) + 7));
        System.out.println("A is : " + a);
        System.out.println("B is : " + b);
        System.out.println("Prime is : " + prime);
        System.out.println("Final Result is :: " + power_calc(a, b, prime));
    }
}
