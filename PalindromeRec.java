import java.util.Scanner;

public class PalindromeRec {
    public static int palindrome(int num, int rev) {
        if (num == 0) {
            return rev;
        }
        rev = rev * 10 + num % 10;
        return palindrome(num / 10, rev);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int rev = 0;
        rev = palindrome(num, rev);
        if (num == rev) {
            System.out.println("Yes the number is palindrome ");
        } else {
            System.out.println("No the number is not palindrome");
        }
        scan.close();
    }
}
