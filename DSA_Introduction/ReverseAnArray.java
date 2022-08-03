package DSA_Introduction;

public class ReverseAnArray {
    static void reverse(int arr[], int n) {
        int i = 0;
        int j = n - 1;
        int temp;
        while(i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,1,4,6,8,14};
        int n = arr.length;
        System.out.println("Before Reverse...");
        for(int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println();
        reverse(arr, n);
        System.out.println("After Reverse...");
        for(int i : arr) {
            System.out.print(i + ",");
        }
    }
}
