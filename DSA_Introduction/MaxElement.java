package DSA_Introduction;

import java.util.Arrays;

public class MaxElement {
    // TC : O(n^2)
    static void approach_1(int arr[], int n) {
        boolean isMax;
        for(int i = 0; i < n; i++) {
            isMax = true;
            for(int j = 0; j < n; j++) {
                if(arr[j] > arr[i]) {
                    isMax = false;
                }
            }
            if(isMax) {
                System.out.println("Max Element is : " + arr[i]);
                return;
            }
        }
    }

    // TC : O(nlogn)
    static int approach_2(int arr[], int n) {
        // Arrays.sort used Tim Sort Algorithm to sort array
        Arrays.sort(arr);
        int max = arr[n-1];
        return max;
    }

    static int approach_3(int arr[], int n) {
        int max = arr[0];
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {3,1,5,6,56,12,51};
        int n = arr.length;
        approach_1(arr, n);
    }
}
