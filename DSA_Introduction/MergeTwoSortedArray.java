package DSA_Introduction;

public class MergeTwoSortedArray {

    static int[] merge(int arr_1[], int arr_2[], int m, int n) {
        int arr_3[] = new int[m + n];
        int i = 0, j = 0, k = 0;
        while(i < m && j < n) {
            if(arr_1[i] < arr_2[j]) {
                arr_3[k++] = arr_1[i++];
            }
            else {
                arr_3[k++] = arr_2[j++];
            }
        }
        while(i < m) {
            arr_3[k++] = arr_1[i++];
        }
        while(j < n) {
            arr_3[k++] = arr_2[j++];
        }
        return arr_3;
    }

    public static void main(String[] args) {
        int arr_1[] = {4,8,12,20};
        int arr_2[] = {3,6,9,11,25};
        int m = arr_1.length;
        int n = arr_2.length;
        int arr_3[] = merge(arr_1, arr_2, m, n);
        for(int i : arr_3) {
            System.out.print(i + ",");
        }
    }
}
