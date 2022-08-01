import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        boolean prime = true;
        int num = scanner.nextInt();
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                // System.out.println("Not Prime...");
                prime = false;
                break;
            }
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
