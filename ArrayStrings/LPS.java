package ArrayStrings;

public class LPS {
    static int LPS(String str, int n) {
        for(int len  = n - 1; len > 0; len--) {
            boolean isMatch = true;
            for(int i = 0; i < len; i++) {
                if(str.charAt(i) != str.charAt(n - len + i)) {
                    isMatch = false;
                }
            }
            if(isMatch) {
                return len;
            }
        }
        return 0;
    }

    static void efficientSol(String str, int []lps, int n) {
        int len = 0;
        lps[0] = 0;
        int i = 1;
        while(i < n) {
            if(str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            else {
                if(len == 0) {
                    lps[i] = 0;
                    i++;
                }
                else {
                    len = lps[len - 1];
                }
            }
        }
    }

    public static void main(String[] args) {
        String str = "ABABABA";
        int n = str.length();
        int lps[] = new int[n];
        for(int i = 0; i < n; i++) {
            lps[i] = LPS(str, i+1);
            System.out.print(lps[i] + ", ");
        }
    }
}
