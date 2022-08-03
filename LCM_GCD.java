import java.util.Scanner;

public class LCM_GCD {
    static int findGCD(int a, int b) {
        int gcd;
        while (a % b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return gcd = b;
    }

    // static int findLCM(int a, int b) {
    // int lcm;

    // return lcm;
    // }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, gcd, lcm = 0;
        System.out.println("Enter both numbers");
        a = scan.nextInt();
        b = scan.nextInt();
        if (a > b) {
            gcd = findGCD(a, b);
        } else {
            gcd = findGCD(b, a);
        }
        lcm = (a * b) / gcd;
        System.out.println("LCM is " + lcm + " GCD is " + gcd);
        scan.close();
    }
}
