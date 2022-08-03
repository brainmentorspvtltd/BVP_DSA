package DSA_Introduction;

public class StockBuySell {
    static void approach_1(int arr[], int n) {
        int first = 0;
        int last = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            for(int j  = i + 1; j < n; j++) {
                if(max < (arr[j] - arr[i])) {
                    max = arr[j] - arr[i];
                    first = arr[i];
                    last = arr[j];
                }
            }
        }
        System.out.println(first + "," + last);
    }

    static void approach_2(int arr[], int n) {
        int pmin[] = new int[n];
        int finalProfit, profit=0;
        pmin[0] = arr[0];
        for(int i = 1; i < n; i++) {
            pmin[i] = Math.min(pmin[i-1], arr[i]);
        }
        for(int i = 1; i < n; i++){
            finalProfit = arr[i] - pmin[i];
            profit = Math.max(finalProfit, profit);
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,6,3,4};

    }
}
