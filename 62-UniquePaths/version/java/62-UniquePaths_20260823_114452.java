// Last updated: 23/08/2026, 11:44:52
1class Solution {
2    public int uniquePaths(int m, int n) {
3
4        int[] dp = new int[n];
5
6        // First row: there is only 1 way to reach every cell
7        for (int j = 0; j < n; j++) {
8            dp[j] = 1;
9        }
10
11        // Process remaining rows
12        for (int i = 1; i < m; i++) {
13
14            for (int j = 1; j < n; j++) {
15                // Ways from above + ways from left
16                dp[j] = dp[j] + dp[j - 1];
17            }
18        }
19
20        return dp[n - 1];
21    }
22}
23