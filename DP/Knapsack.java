public class Knapsack {

    static int ks(int []wt, int vl[], int max, int index) {
        // Base Case
        if(index == wt.length || max == 0) {
            return 0;
        }

        if(wt[index] > max) {
            return ks(wt, vl, max, index+1);
        }

        else {
            // Inclusion
            int opt_1 = ks(wt, vl, max - wt[index], index+1);
            // Exclusion
            int opt_2 = ks(wt, vl, max, index+1);
            return Math.max(opt_1, opt_2);
        }
    }

    static int ks_tabulation(int W, int wt[], int vl[], int n) {
        int [][]k = new int[n+1][W+1];
        int i, w;
        for(i = 0; i <= n; i++) {
            for(w = 0; w <= W; w++) {
                if(i == 0 || w == 0) {
                    k[i][w] = 0;
                }
                else if(wt[i-1] <= w) {
                    k[i][w] = Math.max(k[i-1][w], k[i-1][w - wt[i-1]] + vl[i-1]);
                }
                else {
                    k[i][w] = k[i-1][w];
                }
            }
        }
        return k[n][W];
    }

    public static void main(String[] args) {
        int wt[] = {10,20,30};
        int values[] = {60,100,120};
        int max = 50;
        int n = wt.length;
        int output = ks_tabulation(max, wt, values, n);
        System.out.println("Output is : " + output);
    }
}
