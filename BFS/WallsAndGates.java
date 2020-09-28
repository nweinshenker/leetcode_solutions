package BFS;

import java.util.LinkedList;
import java.util.Queue;

public class WallsAndGates {
    public void wallsAndGates(int[][] rooms) {
        if (rooms.length == 0)
            return;
        Queue<int[]> queue = new LinkedList<int[]>();
        int n = rooms.length;
        int m = rooms[0].length;

        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (rooms[i][j] == 0) {
                    queue.add(new int[] { i, j });
                    int dist = 0; // Distance variable so far from the gate

                    // Perform the BFS search through each position
                    while (!queue.isEmpty()) {
                        int size = queue.size();
                        for (int k = 0; k < size; k++) {
                            int[] pos = queue.poll();
                            int x = pos[0];
                            int y = pos[1];
                            if (validPos(x + 1, y, n, m) && rooms[x + 1][y] != -1 && rooms[x + 1][y] > dist + 1) {
                                queue.add(new int[] { x + 1, y });
                                rooms[x + 1][y] = dist + 1;
                            }
                            if (validPos(x - 1, y, n, m) && rooms[x - 1][y] != -1 && rooms[x - 1][y] > dist + 1) {
                                queue.add(new int[] { x - 1, y });
                                rooms[x - 1][y] = dist + 1;
                            }
                            if (validPos(x, y + 1, n, m) && rooms[x][y + 1] != -1 && rooms[x][y + 1] > dist + 1) {
                                queue.add(new int[] { x, y + 1 });
                                rooms[x][y + 1] = dist + 1;
                            }
                            if (validPos(x, y - 1, n, m) && rooms[x][y - 1] != -1 && rooms[x][y - 1] > dist + 1) {
                                queue.add(new int[] { x, y - 1 });
                                rooms[x][y - 1] = dist + 1;
                            }
                        }
                        dist = dist + 1;
                    }
                }
            }
        }

    }

    public boolean validPos(int x, int y, int n, int m) {
        return !(x >= n || x < 0 || y >= m || y < 0);
    }

}
