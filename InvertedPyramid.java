import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int n, i, j;
         n = scan.nextInt();

        for ( i = n; i >= 1; i--) {
            for ( j = 0; j < n - i; j++) {// to draw the spaces
                System.out.print("  ");
            }
            for ( j = i; j <= 2 * i - 1; j++) {// to draw the left half traingle
                System.out.print("* ");
            }
            for ( j = 0; j < i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
