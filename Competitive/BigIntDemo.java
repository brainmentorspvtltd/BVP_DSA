import java.math.BigInteger;

public class BigIntDemo {
    public static void main(String[] args) {
        BigInteger x1 = new BigInteger("121");
        BigInteger x2 = new BigInteger("124");
        BigInteger res = x1.add(x2);
        System.out.println("Result is : " + res);
    }    
}
