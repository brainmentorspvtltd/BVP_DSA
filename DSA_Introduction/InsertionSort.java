package DSA_Introduction;

public class InsertionSort {

    static void insertionSort(int arr[], int n) {
        for(int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,2,5,6,11,2,15};
        int n = arr.length;
        insertionSort(arr, n);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
