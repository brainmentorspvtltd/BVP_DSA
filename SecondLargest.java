import java.util.Scanner;

class SecondLargest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Max, secondMax, i;
        int[] arr = new int[5];
        for (i = 0; i < 5; i++)
            arr[i] = scan.nextInt();
        Max = Integer.MIN_VALUE;
        secondMax = Integer.MIN_VALUE;
        for (i = 0; i < 5; i++) {
            if (Max < arr[i]) {
                secondMax = Max;
                Max = arr[i];
            } else if (Max > arr[i] && secondMax < arr[i]) {
                secondMax = arr[i];
            }
        }
        System.out.println("Max element is " + Max + " Second Max element is " + secondMax);
        scan.close();
    }
}