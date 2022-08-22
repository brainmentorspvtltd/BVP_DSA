package Competitive;

public class DivisibleByPrime {
    static void solution(int n) {
        int []primes = {2,3,5,7,11};
        int m = primes.length;
        for(int i = 0; i < m; i++) {
            int lcm = 1;
            for(int j = 1; j < m; j++) {
                // check if jth bit of ith element is set then include it
                if(((i >> j) & 1) == 1) {
                    lcm *= primes[i];
                }
            }
        }
    }
    public static void main(String[] args) {
        solution(20);
    }
}
