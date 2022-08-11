public class QuickSort {

    static int partition(int arr[], int low, int high) {
        // get pivot element
        int pivot = arr[high];
        // secondary pointer for greater element
        int j = low-1;
        // compare each element with pivot
        for(int i = low; i < high; i++) {
            if(arr[i] <= pivot) {
                j++;
                // swapping
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // now swap pivot element with secondary pointer
        int temp = arr[j+1];
        arr[j+1] = arr[high];
        arr[high] = temp;

        // return the index where partition is performed
        return (j+1);

    }

    static void quickSort(int arr[], int low, int high) {
        if(low < high) {
            // find pivot element
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex-1);
            quickSort(arr, partitionIndex+1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,2,5,6,11,2,15};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
