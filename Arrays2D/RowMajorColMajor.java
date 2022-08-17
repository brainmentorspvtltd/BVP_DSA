package Arrays2D;

public class RowMajorColMajor {
    public static void main(String[] args) {
        // int arr[][] = new int[3][3];
        // int []arr[] = new int[3][3];
        // int [][]arr = new int[3][3];
        int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        int row_size = arr.length;
        int col_size = arr[0].length;

        System.out.println("Row Major");
        // row major
        for(int i = 0; i < row_size; i++){
            for(int j = 0; j < col_size; j++) {
                System.out.print(arr[i][j] + ",");
            }
            System.out.println();
        }

        System.out.println("Column Major");

        // col major
        for(int i = 0; i < row_size; i++){
            for(int j = 0; j < col_size; j++) {
                System.out.print(arr[j][i] + ",");
            }
            System.out.println();
        }
    }
}
