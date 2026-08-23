// Last updated: 23/08/2026, 11:18:04
1import java.util.*;
2
3class Solution {
4    public int minimumTotal(List<List<Integer>> triangle) {
5        int n = triangle.size();
6
7        // dp[j] = minimum path sum from current position
8        // to the bottom
9        int[] dp = new int[n];
10
11        // Start with the bottom row
12        for (int j = 0; j < n; j++) {
13            dp[j] = triangle.get(n - 1).get(j);
14        }
15
16        // Work from the second-last row upwards
17        for (int i = n - 2; i >= 0; i--) {
18            for (int j = 0; j <= i; j++) {
19
20                dp[j] = triangle.get(i).get(j)
21                       + Math.min(dp[j], dp[j + 1]);
22            }
23        }
24
25        return dp[0];
26    }
27}
28