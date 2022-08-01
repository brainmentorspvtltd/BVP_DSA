public class CommandLineDemo {
    public static void main(String[] args) {
        System.out.println("Addition of numbers...");
        // Return length of array
        int n = args.length;
        int sum = 0;
        // Integer x = 10;
        // for(int i = 0; i < n; i++) {
        //     sum += Integer.parseInt(args[i]);
        // }

        // Enhanced For Loop
        for(String i : args) {
            sum += Integer.parseInt(i);
        }

        System.out.println("Sum is : " + sum);
    }
}
