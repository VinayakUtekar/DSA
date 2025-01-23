import java.util.*;

public class ShortestPathToPrintString {

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}}; // Right, Left, Down, Up

    public static String findShortestPath(char[][] screen, String str) {
        int rows = screen.length;
        int cols = screen[0].length;

        // Create a map to store the coordinates of each character
        Map<Character, Point> charMap = new HashMap<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                charMap.put(screen[i][j], new Point(i, j));
            }
        }

        StringBuilder path = new StringBuilder();
        Point current = new Point(0, 0); // Start from top-left corner

        for (char c : str.toCharArray()) {
            Point target = charMap.get(c);

            // Calculate the shortest path to the target character
            path.append(findPath(current, target));
            path.append("Press OK\n");

            current = target; // Update current position
        }

        return path.toString();
    }

    public static String findPath(Point start, Point end) {
        StringBuilder path = new StringBuilder();

        int dx = end.x - start.x;
        int dy = end.y - start.y;

        // Move vertically
        if (dx > 0) {
            for (int i = 0; i < dx; i++) {
                path.append("Move Down\n");
            }
        } else if (dx < 0) {
            for (int i = 0; i < -dx; i++) {
                path.append("Move Up\n");
            }
        }

        // Move horizontally
        if (dy > 0) {
            for (int i = 0; i < dy; i++) {
                path.append("Move Right\n");
            }
        } else if (dy < 0) {
            for (int i = 0; i < -dy; i++) {
                path.append("Move Left\n");
            }
        }

        return path.toString();
    }

    public static void main(String[] args) {
        char[][] screen = {
                {'A', 'B', 'C', 'D', 'E'},
                {'F', 'G', 'H', 'I', 'J'},
                {'K', 'L', 'M', 'N', 'O'},
                {'P', 'Q', 'R', 'S', 'T'},
                {'U', 'V', 'W', 'X', 'Y'},
                {'Z'}
        };

        String str = "GEEK";

        String shortestPath = findShortestPath(screen, str);
        System.out.println(shortestPath);
    }
}