public class Loops {
    public static void main(String[] args) {
        // for / while / labeled for loop / enhanced for loop
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int n = 10;
        while(n > 0) {
            System.out.println(n);
            n--;
        }

        int arr[] = {43,5,6,7};
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println("================");

        // Labeled for loop
        outer:
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.println("I : " + i + ", J : " + j);
                if(i > 3 && j > 3) {
                    break outer;
                }
            }
            // System.out.println();
        }

    }
}
