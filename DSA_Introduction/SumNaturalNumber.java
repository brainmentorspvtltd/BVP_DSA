package DSA_Introduction;

public class SumNaturalNumber {

    int func(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    int func_2(int n) {
        return n * (n+1) / 2;
    }

    int func_3(int n) {
        int sum = 0;
        for(int i = 0; i <=n; i++) {
            for(int j =1; j <= i; j++) {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        
    }
}
