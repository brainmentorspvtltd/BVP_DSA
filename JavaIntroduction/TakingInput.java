import java.io.IOException;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) throws IOException {
        // int x = System.in.read();
        // System.out.println("Input is : " + x);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your ID : ");
        int id = scanner.nextInt();

        scanner.nextLine(); // it will eat \n left in buffer

        System.out.println("Enter your name : ");
        String name = scanner.nextLine();

        System.out.println("Enter your emailId : ");
        String email = scanner.nextLine();

        System.out.println("ID : " + id);
        System.out.println("Hello : " + name);
        System.out.println("Email ID : " + email);
        scanner.close();
    }
}
