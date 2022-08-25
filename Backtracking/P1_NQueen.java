public class P1_NQueen {

    static int countWays(boolean [][]board, int currentRow) {
        int countDown = 0;
        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board.length; col++) {
                if(board[row][col]) {
                    System.out.println(board[row][col] + "," + row + "," + col);
                    countDown++;
                }
            }
        }
        return countDown;
    }

    static int getCount(boolean [][]board, int currentRow) {
        int count = 0;
        if(currentRow == board.length) {
            countWays(board, currentRow);
            return 1;
        }
        for(int col = 0; col < board.length; col++) {
            if(isSafeArea(board, currentRow, col)) {
                board[currentRow][col] = true;
                count = count + getCount(board, currentRow + 1);
                // Backtrack
                board[currentRow][col] = false;
            }
        }
        return count;
    }

    static boolean isSafeArea(boolean board[][], int row, int col) {
        // checking for same column
        for(int i = row; i >= 0; i--) {
            if(board[i][col]) {
                return false;
            }
        }

        // checking in upper left diagonal
        for(int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j]) {
                return false;
            }
        }

        // checking in upper right diagonal
        for(int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if(board[i][j]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        boolean board[][] = new boolean[4][4];
        System.out.println("Possible Ways :: " + getCount(board, 0));
    }
}
