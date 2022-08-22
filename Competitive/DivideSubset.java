package Competitive;

public class DivideSubset {

    static void divSub(int arr[], int n) {
        int prefix[] = new int[n];
        // because we will always have null sub array
        prefix[0] = 1;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            sum %= n;
            sum = (sum + n) % n;
            prefix[sum]++;
        }
        // for(int i = 0; i < n; i++) {
        //     System.out.print(prefix[i] + ",");
        // }
        int output = 0;
        for(int i = 0; i < n; i++) {
            int x = prefix[i];
            output += (x) * (x-1) / 2;
        }
        System.out.println("Output is : " + output);
    }

    public static void main(String[] args) {
        int arr[] = {1,3,2,6,4};
        int n = arr.length;
        divSub(arr, n);
    }
}
