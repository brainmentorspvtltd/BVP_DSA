import java.util.Scanner;

public class PrimeNumber_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        boolean prime = true;
        int num = scanner.nextInt();

        if(num % 2 == 0 || num % 3 == 0) {
            prime = false;
        }
        int total_iter = 1;
        for(int i = 5; i < num / 2; i=i+6) {
            // System.out.println("Iteration : " + i);
            System.out.println("Iteration : " + total_iter);
            if(num % i == 0 || num % i + 2 == 0) {
                // System.out.println("Not Prime...");
                prime = false;
                break;
            }
            total_iter++;
        }

        if(prime) {
            System.out.println(num + " is a prime number");
        }
        else {
            System.out.println(num + " is not a prime number");
        }

        scanner.close();
    }
}
