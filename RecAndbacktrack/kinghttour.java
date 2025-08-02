//2596. Check Knight Tour Configuration
package RecAndbacktrack;

public class kinghttour {

    public boolean isValid(int[][] grid, int r, int c, int n, int expectedValue) {
        if (r < 0 || c < 0 || c >= n || r >= n || grid[r][c] != expectedValue) {
            return false;
        }
        if (expectedValue == n * n - 1) {
            return true;
        }
        boolean ans1 = isValid(grid, r - 2, c + 1, n, expectedValue + 1);
        boolean ans2 = isValid(grid, r - 1, c + 2, n, expectedValue + 1);
        boolean ans3 = isValid(grid, r + 1, c + 2, n, expectedValue + 1);
        boolean ans4 = isValid(grid, r + 2, c + 1, n, expectedValue + 1);
        boolean ans5 = isValid(grid, r + 2, c - 1, n, expectedValue + 1);
        boolean ans6 = isValid(grid, r + 1, c - 2, n, expectedValue + 1);
        boolean ans7 = isValid(grid, r - 1, c - 2, n, expectedValue + 1);
        boolean ans8 = isValid(grid, r - 2, c - 1, n, expectedValue + 1);

        return ans1 || ans2 || ans3 || ans4 | ans5 || ans6 || ans7 || ans8;

    }

    public boolean checkValidGrid(int[][] grid) {
        int n = grid.length;
        return isValid(grid, 0, 0, n, 0);

    }
}
