package Competitive;

public class BinaryExponentiation {
    static int pow(int a, int b) {
        int result = 1;
        while(b > 0) {
            // check last set bit
            if((b & 1) == 1) {
                result = result * a;
            }
            a = a * a;
            b = b >> 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int res = pow(2, 200);
        System.out.println("Result is :: " + res);
    }
}
