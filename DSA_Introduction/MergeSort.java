package DSA_Introduction;

import java.util.ArrayList;

public class MergeSort {

    static void merge(int arr[], int low, int high) {
        int start = low;
        int mid = (low + high) / 2;
        int j = mid + 1;
        ArrayList<Integer> temp = new ArrayList<>();
        while(start <= mid && j <= high) {
            if(arr[start] <= arr[j]) {
                temp.add(arr[start++]);
            }
            else {
                temp.add(arr[j++]);
            }
        }
        while(start <= mid) {
            temp.add(arr[start++]);
        }
        while(j <= high) {
            temp.add(arr[j++]);
        }

        int k = 0;
        for(int i = low; i <= high; i++) {
            arr[i] = temp.get(k++);
        }
    }

    static void mergeSort(int arr[], int start, int end) {
        if(start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, end);
    }

    public static void main(String[] args) {
        int arr[] = {3,2,5,6,11,2,15};
        int n = arr.length;
        mergeSort(arr, 0, n-1);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
