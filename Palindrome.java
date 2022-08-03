import java.util.Scanner;

//palindrome is number whose reverse is equal to itself like 121, 343...
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        int temp = n;
        int rev = 0;
        while(n>0){
            int digit = n%10;
            rev = rev*10+digit;
            n = n/10;
        }
        if(rev==temp){
            System.out.println("The numebr is palindrome");
        }
        else{
            System.out.println("the number is not palindrome");
        }
        scan.close();
    }
}
