package Competitive;

public class BinaryModExponentiation {
    static int power_calc(int a, int b, int mod) {
        int result = 1;
        System.out.println("A is : " + a);
        System.out.println("B is : " + b);
        // a = a % mod;
        // if(a == 0) {
        //     return 0;
        // }
        while(b > 0) {
            // check last set bit
            if((b & 1) == 1) {
                // result = (result * a) % mod;
                result *= a;
                result %= mod;
            }
            a =((a % mod)  * (a % mod)) % mod;
            // a = a % mod;
            b = b >> 1;
        }
        return result;
    }
    public static void main(String[] args) {
        // int res = pow(2, 100, 13);
        int res = power_calc(2, 100, (int)Math.pow(10, 9) + 7);
        System.out.println("Final Result is :: " + res);
    }
}
