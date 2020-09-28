package BFS;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        if (grid.length == 0)
            return 0;
        Queue<int[]> queue = new LinkedList<int[]>();

        int islandCount = 0;
        int n = grid.length;
        int m = grid[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    islandCount++;
                    // Add the queue and visit
                    queue.add(new int[] { i, j });
                    grid[i][j] = '0';
                    searchIsland(queue, grid);
                }
            }
        }

        return islandCount;
    }

    public void searchIsland(Queue<int[]> queue, char[][] grid) {
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] pos = queue.poll();
                int x = pos[0];
                int y = pos[1];
                if (validPos(grid.length, grid[0].length, x - 1, y) && grid[x - 1][y] == '1') {
                    queue.add(new int[] { x - 1, y });
                    grid[x - 1][y] = '0';
                }
                if (validPos(grid.length, grid[0].length, x + 1, y) && grid[x + 1][y] == '1') {
                    queue.add(new int[] { x + 1, y });
                    grid[x + 1][y] = '0';
                }
                if (validPos(grid.length, grid[0].length, x, y + 1) && grid[x][y + 1] == '1') {
                    queue.add(new int[] { x, y + 1 });
                    grid[x][y + 1] = '0';
                }
                if (validPos(grid.length, grid[0].length, x, y - 1) && grid[x][y - 1] == '1') {
                    queue.add(new int[] { x, y - 1 });
                    grid[x][y - 1] = '0';
                }
            }
        }
    }

    public boolean validPos(int n, int m, int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < m);
    }
}
