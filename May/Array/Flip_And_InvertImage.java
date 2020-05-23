package May.Array;

public class Flip_And_InvertImage {
    public int[][] flipAndInvertImage(int[][] A) {
        // Reverses each row
        for (int i = 0; i < A.length; i++) {
            for (int j = 0, z = A[i].length - 1; j < z; j++, z--) {
                // Swap the elements
                int temp = A[i][j];
                A[i][j] = A[i][z];
                A[i][z] = temp;
            }
        }

        int row = A.length;
        int col = A[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                A[i][j] = A[i][j] ^ 1;
            }
        }

        return A;
    }

    // Efficient Solution
    public int[][] flipAndInvertImage2(int[][] A) {
        int C = A[0].length;
        for (int[] row : A)
            for (int i = 0; i < (C + 1) / 2; ++i) {
                int tmp = row[i] ^ 1;
                row[i] = row[C - 1 - i] ^ 1;
                row[C - 1 - i] = tmp;
            }

        return A;
    }
}