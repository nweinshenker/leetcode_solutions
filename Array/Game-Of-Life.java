class Solution {
    public void gameOfLife(int[][] board) {
        int [][] copy = new int [board.length][];
        for (int i = 0; i < board.length; i++) {
            copy[i] = Arrays.copyOf(board[i], board[i].length);
        }

        int n = board.length;
        int m = board[0].length;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                // Calculate the neighborhood at the edges
                int aliveCount = 0;       
                for (int k = i -1; k < i + 2; k++) {
                    for (int l = j - 1; l < j + 2; l++) {
                        if (k < 0 || k > n - 1 || l < 0 || l > m - 1 || (k == i && l == j)) {
                            continue;
                        } 
                        if (board[k][l] == 1) aliveCount++;

                    }

                }

                if (board[i][j] == 1 && aliveCount < 2) {
                    copy[i][j] = 0;
                }
                else if (board[i][j] == 1 && (aliveCount == 2 || aliveCount == 3)) {
                    copy[i][j] = 1;
                }
                else if (board[i][j] == 1 && aliveCount > 3) {
                    copy[i][j] = 0;
                }
                else if (board[i][j] == 0 && aliveCount == 3) {
                    copy[i][j] = 1;
                }
                else {
                    copy[i][j] = board[i][j];
                }
            }
        }

        // Copy the copy back into the board
        for (int i = 0; i < copy.length; i++) {
            board[i] = Arrays.copyOf(copy[i], copy[i].length);
        }
    }
}