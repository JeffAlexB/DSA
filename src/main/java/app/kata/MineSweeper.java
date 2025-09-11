package app.kata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MineSweeper{

    // 8 neighbor directions: (rowDelta, colDelta)
    private static final int[][] DIRS = {
            {-1, -1}, {-1, 0}, {-1, 1},
            { 0, -1},          { 0, 1},
            { 1, -1}, { 1, 0}, { 1, 1}
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<char[][]> fields = new ArrayList<>();
        List<int[]> sizes = new ArrayList<>(); // keep (n, m) to print later if you want

        while (true) {
            String line = br.readLine();
            if (line == null) break;
            line = line.trim();
            if (line.isEmpty()) continue;

            String[] parts = line.split("\\s+");
            if (parts.length != 2) continue; // robust-ish; or throw

            int n = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);
            if (n == 0 && m == 0) break;     // end of input

            char[][] grid = new char[n][m];
            for (int r = 0; r < n; r++) {
                String row = br.readLine();
                // assuming well-formed input: exactly m chars of '.' or '*'
                grid[r] = row.toCharArray();
            }
            fields.add(grid);
            sizes.add(new int[]{n, m});
        }

        // Process & print
        for (int idx = 0; idx < fields.size(); idx++) {
            char[][] field = fields.get(idx);
            char[][] transformed = transform(field);

            System.out.println("Field #" + (idx + 1) + ":");
            for (char[] row : transformed) {
                System.out.println(new String(row));
            }
            if (idx < fields.size() - 1) {
                System.out.println(); // blank line between fields
            }
        }
    }

    /**
     * Transform a minesweeper field: '.' -> digit of adjacent mines, '*' stays '*'.
     * Time: O(n*m)   Space: O(n*m)
     */
    public static char[][] transform(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        char[][] out = new char[n][m];

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                if (grid[r][c] == '*') {
                    out[r][c] = '*';
                } else {
                    int mines = countAdjacentMines(grid, r, c);
                    out[r][c] = (char) ('0' + mines); // convert 0..8 to '0'..'8'
                }
            }
        }
        return out;
    }

    private static int countAdjacentMines(char[][] g, int r, int c) {
        int n = g.length, m = g[0].length, count = 0;
        for (int[] d : DIRS) {
            int nr = r + d[0], nc = c + d[1];
            if (nr >= 0 && nr < n && nc >= 0 && nc < m && g[nr][nc] == '*') {
                count++;
            }
        }
        return count;
    }
}
