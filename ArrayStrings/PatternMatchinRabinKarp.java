package ArrayStrings;

public class PatternMatchinRabinKarp {
    public static void main(String[] args) {
        String str = "ABCCABCBABCDCB";
        String pat = "ABC";
        int n = str.length();
        int p = pat.length();
        int d = 26;
        int stringHash = 0;
        int patternHash = 0;
        // Some prime number
        int q = 13;
        for(int i = 0; i < p; i++) {
            patternHash = (patternHash * d + (pat.charAt(i))) % q;
            stringHash = (stringHash * d + (str.charAt(i))) % q;
        }
        System.out.println(patternHash + "," + stringHash);
        for(int i = 0; i <= n - p; i++) {
            if(patternHash == stringHash) {
                int j;
                for(j = 0; j < p; j++) {
                    if(pat.charAt(j) != str.charAt(i + j)) {
                        break;
                    }
                }
                if(j == p) {
                    System.out.println("Pattern Match : " + i);
                }
            }

            if(i < n - p) {
                // removing old hash
                stringHash = stringHash - (str.charAt(i) * d);
                stringHash = ((stringHash * d) + str.charAt(i + p)) % q;
                if(stringHash < 0) {
                    stringHash = stringHash + q;
                }
            }

        }
    }
}
