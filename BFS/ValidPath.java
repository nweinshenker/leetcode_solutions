package BFS;

public class ValidPath {
    public boolean hasValidPath(int[][] grid) {
        if (grid.length <= 1 && grid[0].length <= 1)
            return true;
        int[][][] street = new int[][][] { { { 0, 0 }, { 0, 0 } }, { { 0, -1 }, { 0, 1 } }, { { 1, 0 }, { -1, 0 } },
                { { 0, -1 }, { 1, 0 } }, { { 1, 0 }, { 0, 1 } }, { { 0, -1 }, { -1, 0 } }, { { -1, 0 }, { 0, 1 } } };
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        return visit(0, 0, 0, 0, grid, street, visited);
    }

    private boolean visit(int i, int j, int x, int y, int[][] grid, int[][][] street, boolean[][] v) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || !valid(i, j, x, y, grid, street)) {
            return false;
        }
        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return true;
        }
        if (v[i][j])
            return false;

        v[i][j] = true;
        int[][] st = street[grid[i][j]];

        x = i + st[0][0];
        y = j + st[0][1];

        if (visit(x, y, i, j, grid, street, v)) {
            return true;
        }

        x = i + st[1][0];
        y = j + st[1][1];

        if (visit(x, y, i, j, grid, street, v)) {
            return true;
        }
        v[i][j] = false;
        return false;
    }

    private boolean valid(int i, int j, int x, int y, int[][] grid, int[][][] street) {
        if (i == x && j == y)
            return true;
        int[][] st1 = street[grid[i][j]];
        int[][] st2 = street[grid[x][y]];

        if (((i + st1[0][0]) == x || (i + st1[1][0]) == x) && ((j + st1[0][1]) == y || (j + st1[1][1]) == y))
            return true;

        return false;
    }
}
