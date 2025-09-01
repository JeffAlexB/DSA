package app.euler;

public class Euler15LatticePaths {
    public long LatticePaths(int gridSize){
        long[][] paths = new long[gridSize + 1][gridSize + 1]; // +1 since the starting point of the path is (0,0) in the grid.

        /**
         * init the first row and column of the grid with 1, since they default are at least '1'
         * independent of size since anyway to reach the first row of grids is down, and right 1 step
         */
        for (int i = 0; i <= gridSize; i++){
            paths[0][i] = 1;
            paths[i][0] = 1;
        }

        /**
         * Fills in the rest of the table, for each cell i,j, there is a sum of moves/paths of
         * i-1,j above it and i,j-1 to the left of it that lead to the bottom right corner of
         * the grid independent of size.
         */
        for (int i = 1; i <= gridSize; i++){
            for (int j = 1; j <= gridSize; j++){
                paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
            }
        }

        return paths[gridSize][gridSize];
    }
}
