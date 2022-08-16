package ArrayStrings;

public class PatternMatchWindowSliding {
    public static void main(String[] args) {
        String str = "ABCACBABC";
        String pattern = "ABC";
        int patternLen = pattern.length();
        for(int i = 0; i < str.length() - patternLen; i++) {
            int j;
            for(j = 0; j < patternLen; j++) {
                if(pattern.charAt(j) != str.charAt(i+j)) {
                    break;
                }
            }
            if(j == patternLen) {
                System.out.println("Pattern Found at : " + i);
            }
        }
    }
}
