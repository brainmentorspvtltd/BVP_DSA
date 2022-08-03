import java.util.Scanner;

public class RotateArrayByK {
    static void reverse(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = { 10, 20, 30, 40, 50 };
        int n = arr.length;
        int k = scan.nextInt();
        k = k % n; // range case handle
        System.out.println(k);
        // negative case handle
        if (k < 0) {
            k = n + k;
            System.out.println(k);
        }
        reverse(arr, 0, n - k - 1);
        for (int i = 0; i < n; i++)
        System.out.print(arr[i]+" ");
        System.out.println();
        reverse(arr, n - k, n - 1);
        for (int i = 0; i < n; i++)
        System.out.print(arr[i]+" ");
        System.out.println();
        reverse(arr, 0, n - 1);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i]+" ");
        scan.close();
    }
}