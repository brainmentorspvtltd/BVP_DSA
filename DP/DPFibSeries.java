public class DPFibSeries {
    
    // Memoization
    static int fibo(int n, int[] cache) {
        if(n <= 1) {
            return n;
        }
        if(cache[n] != 0) {
            return cache[n];
        }
        int first = fibo(n-1, cache);
        int second = fibo(n-2, cache);
        int res = first + second;
        cache[n] = res;
        return cache[n];
    }

    // Tabulation
    static int tabulation(int n, int[] cache) {
        cache[0] = 0;
        cache[1] = 1;
        for(int i = 2; i <= n; i++) {
            cache[i] = cache[i-1] + cache[i-2];
        }
        return cache[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int cache[] = new int[n+1];
        fibo(n, cache);
    }
}
