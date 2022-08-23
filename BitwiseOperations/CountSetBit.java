public class CountSetBit {
    public static void main(String[] args) {
        int result = 0;
        int n = 12;
        // TC : O(total set bit)
        while(n > 0) {
            n = (n & (n-1));
            result++;
        }
    }
}
