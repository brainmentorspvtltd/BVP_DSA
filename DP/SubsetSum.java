public class SubsetSum {

    static boolean isSubset(int arr[], int sum, int n) {
        if(n <= 0 || sum < 0) {
            return false;
        }
        if(sum == 0) {
            return true;
        }
        if(arr[n-1] > sum) {
            return isSubset(arr, sum, n-1);
        }
        return isSubset(arr, sum - arr[n-1], n-1) || isSubset(arr, sum, n-1);
    }

    public static void main(String[] args) {
        int arr[] = {5,3,4,6};
        int sum = 8;
        int n = arr.length;
        System.out.println("Output : " + isSubset(arr, sum, n-1));
    }
}
