import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        int result = 0;
        // int fact = 1;
        // for (int i = 1; i <= n; i++) {
        //     fact *= i;
        // }
        // System.out.println("factorial is "+fact);
        // while (fact % 10 == 0) {
        // result++;
        // fact=fact/10;
        // }

        for(int i=5;i<n;i*=5){
        result = result + n/i;
        }
        System.out.println("Number of zeros are " + result);
        scan.close();
    }
}

/*
 * Here we have to find out trailing zeros without
 * integer overflow, because if a number is too large
 * than it cannot be stored in our data type so there is
 * an efficient way to solve this.
 * We can use prime factorization properties. Trailing
 * zero is always produced by the prime factors 2 and 5.
 * So we will count 5s and 2s in prime factorization of
 * N!.
 * Suppose N = 5 : Prime factor of 5! Is 2x2x2x3x5
 * So there is one 5 and three 2s here. Count of
 * trailing 0s is 1.
 * We can count number of 2s in prime factors is always
 * more than or equal to 5s. So we just need 5s count in
 * prime factors. So how we are going to count 5s in
 * prime factors ?
 * Simply calculate floor(n/5), example 7! Has one 5,
 * 10! Has two 5s. But Numbers like 25 and 125 has more
 * than one 5. Example like 28! Has one extra 5, so
 * number of 0s become 6. We can handle this by first
 * dividing N by 5 and remove all single 5s, then divide
 * by 25 to remove extra 5s and so on. So the formula
 * becomes :
 * Trailing 0s in N!
 * = Count of 5s in prime factors of n!
 * = floor(n/5) + floor(n/25) + floor(n/125)
 * 
 */