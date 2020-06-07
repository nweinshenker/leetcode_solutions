package June.BFS;

import java.util.LinkedList;

public class Flood_Fill {
    class Solution {
        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            LinkedList<Point> queue = new LinkedList<Point>();
            int sourceColor = image[sr][sc];
            queue.offer(new Point(sr, sc));
            while (!queue.isEmpty()) {
                Point p = queue.poll();
                int x = p.x;
                int y = p.y;
                image[x][y] = newColor;
                if (y + 1 < image[0].length && image[x][y + 1] == sourceColor && image[x][y + 1] != newColor) {
                    queue.offer(new Point(x, y + 1));
                }
                if (y != 0 && image[x][y - 1] == sourceColor && image[x][y - 1] != newColor) {
                    queue.offer(new Point(x, y - 1));
                }
                if (x + 1 < image.length && image[x + 1][y] == sourceColor && image[x + 1][y] != newColor) {
                    queue.offer(new Point(x + 1, y));
                }
                if (x != 0 && image[x - 1][y] == sourceColor && image[x - 1][y] != newColor) {
                    queue.offer(new Point(x - 1, y));
                }
            }
            return image;
        }

    }

    class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    } 
}