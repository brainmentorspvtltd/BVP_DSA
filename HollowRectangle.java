import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int r = scan.nextInt();
        System.out.println("Enter number of Columns");
        int c = scan.nextInt();
        for(int i=0;i<r;i++){//for next line
            for(int j=0;j<c;j++){
                if(i==0||j==0||i==r-1||j==c-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
