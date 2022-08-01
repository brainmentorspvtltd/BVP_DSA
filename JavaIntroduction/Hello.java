public class Hello {
    public static void main(String args[]) {
    	System.out.println("Hello World...");
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = x + y;
        System.out.println("Sum is : " + z);
    }
}