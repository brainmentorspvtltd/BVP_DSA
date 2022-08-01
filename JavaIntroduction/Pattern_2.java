public class Pattern_2 {
    public static void main(String[] args) {
        // *
        // **
        // ***
        // ****
        // *****
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 1
        // 12
        // 123
        // 1234
        // 12345

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i+1; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }

        // 1
        // 23
        // 456
        // 78910
        int k = 0;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < i+1; j++) {
                k++;
                System.out.print(k);
            }
            System.out.println();
        }

    }
}
