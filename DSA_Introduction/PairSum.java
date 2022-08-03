package DSA_Introduction;

import java.util.ArrayList;
import java.util.HashMap;

public class PairSum {
    static void approach_1(int arr[], int n, int k) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j <n; j++) {
                sum = arr[i] + arr[j];
                if(sum == k) {
                    System.out.println("Pair Found..." + arr[i] + "," + arr[j]);
                    return;
                }
            }
        }

    }

    static void approach_2(int arr[], int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int e : arr) {
            if(map.get(e) == null) {
                map.put(k - e, e);
            }   
            else {
                System.out.println("Pair Sum Found " + map.get(e) + "," + e);
            }
        }
    }

    static void approach_3(int arr[], int n, int k) {
        // Sort + Two Pointer
    }

    public static void main(String[] args) {
        int arr[] = {2,9,4,3,1,10,6};
        int n = arr.length;
        int k = 9;
        // approach_1(arr, n, k);
        approach_2(arr, n, k);
    }
}
