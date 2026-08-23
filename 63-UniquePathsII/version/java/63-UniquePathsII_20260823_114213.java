// Last updated: 23/08/2026, 11:42:13
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3
4        int m = obstacleGrid.length;
5        int n = obstacleGrid[0].length;
6
7        // dp[j] = number of ways to reach column j
8        int[] dp = new int[n];
9
10        // Starting position
11        dp[0] = 1;
12
13        for (int i = 0; i < m; i++) {
14
15            for (int j = 0; j < n; j++) {
16
17                // Obstacle means no path through this cell
18                if (obstacleGrid[i][j] == 1) {
19                    dp[j] = 0;
20                } else if (j > 0) {
21                    // Ways = from above + from left
22                    dp[j] = dp[j] + dp[j - 1];
23                }
24            }
25        }
26
27        return dp[n - 1];
28    }
29}
30