public class LCS {

    static int count(String s1, String s2) {
        if(s1.length() == 0 || s2.length() == 0) {
            return 0;
        }
        int count = 0;
        if(s1.charAt(0) == s2.charAt(0)) {
            count = 1 + count(s1.subSequence(1), s2.subSequence(1));
        }
        else {
            int res_1 = count(s1.substring(1), s2);
            int res_2 = count(s1, s2.substring(1));
            count = Math.max(res_1, res_2);
        }
    }

    // static int memoization() {

    // }

    static int tabulation(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int matrix[][] = new int[m][n];
        for(int i = 0; i <= m; i++) {
            for(int j = 0; j <= n; j++) {
                if(i == 0 || j == 0) {
                    matrix[i][j] = 0;
                }
                else {
                    if(s1.charAt(i-1) == s2.charAt(j-1)) {
                        matrix[i][j] = matrix[i-1][j-1] + 1;
                    }
                    else {
                        matrix[i][j] = Math.max(matrix[i][j-1], matrix[i-1][j]);
                    }
                }
            }
        }
        return matrix[m][n];
    }

    public static void main(String[] args) {
        
    }
}