import java.util.Scanner;
public class ArmstrongNumber {
	int sum=0;
	 int check_ArmstrongNumber(int num)
	{
		
		 if(num!=0)
		 {
			 sum+=Math.pow(num%10,3);
			 check_ArmstrongNumber(num/10);
		 }
		return sum;
	}
	public static void main(String[] args) {
		Scanner cs=new Scanner(System.in);
	    int num;
	    System.out.print("Enter a number:");
	    num=cs.nextInt();
	    ArmstrongNumber ob=new ArmstrongNumber();
	    if(ob.check_ArmstrongNumber(num)==num)
	    	System.out.print("It is an Armstrong Number.");
	       else
	    	   System.out.print("It is not an Armstrong Number.");
	    cs.close();
	}
}