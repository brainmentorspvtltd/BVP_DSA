public class PowerSet {

    static void subset(String str) {
        int n = str.length();
        int m = (int)Math.pow(2, n);
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++) {
                if((i & (1 << j)) != 0) {
                    System.out.print(str.charAt(j) + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        subset(str);
    }
}
