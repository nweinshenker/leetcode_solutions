public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] res = new int[r][c];
        if (nums.length == 0 || r * c != nums.length * nums[0].length)
            return nums;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                res[count / c][count % c] = nums[i][j];
                count++;
            }
        }
        return res;
    }
}

public class Solution2 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (r * c > nums.length * nums[0].length) return nums;

        int [][] result = new int [r][c];
        int column = 0;
        int row = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                int cell = nums[i][j];
                result[row][column] = cell;
                if (column == c - 1 && row == r - 1) {
                    return result;
                }
                else if (column < c - 1) {
                    column++;
                }
                else {
                    row++;
                    column = 0;
                }
            }
        }

        return result;
    }
}