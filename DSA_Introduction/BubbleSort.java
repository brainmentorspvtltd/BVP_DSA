package DSA_Introduction;

public class BubbleSort {
    static void bubbleSort(int arr[], int n) {
        boolean flag;
        for(int i = 0; i < n; i++) {
            flag = false;
            for(int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,2,5,6,11,2,15};
        int n = arr.length;
        bubbleSort(arr, n);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
