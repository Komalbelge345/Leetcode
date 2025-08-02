package RecAndbacktrack;

import java.util.*;

public class ratinmaze {

    // Function to find all possible paths
    public void solve(int maze[][], int r, int c, int vis[][], String move, int n, ArrayList<String> ans) {
        if (r == n - 1 && c == n - 1) {
            ans.add(move);
            return;
        }
        // down
        if (r + 1 < n && vis[r + 1][c] == 0 && maze[r + 1][c] == 1) {
            vis[r][c] = 1;
            solve(maze, r + 1, c, vis, move + 'D', n, ans);
            vis[r][c] = 0;
        }
        // left
        if (c - 1 >= 0 && vis[r][c - 1] == 0 && maze[r][c - 1] == 1) {
            vis[r][c] = 1;
            solve(maze, r, c - 1, vis, move + 'L', n, ans);
            vis[r][c] = 0;
        }
        // right
        if (c + 1 < n && vis[r][c + 1] == 0 && maze[r][c + 1] == 1) {
            vis[r][c] = 1;
            solve(maze, r, c + 1, vis, move + 'R', n, ans);
            vis[r][c] = 0;
        }
        // up
        if (r - 1 >= 0 && vis[r - 1][c] == 0 && maze[r - 1][c] == 1) {
            vis[r][c] = 1;
            solve(maze, r - 1, c, vis, move + 'U', n, ans);
            vis[r][c] = 0;
        }
    }

    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        int n = maze.length;
        int vis[][] = new int[n][n];
        solve(maze, 0, 0, vis, "", maze.length, ans);
        return ans;

    }
}
