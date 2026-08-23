// Last updated: 23/08/2026, 11:15:00
1class Solution {
2    public int jump(int[] nums) {
3        int jumps = 0;
4        int currentEnd = 0;
5        int farthest = 0;
6
7        for (int i = 0; i < nums.length - 1; i++) {
8
9            // Farthest position reachable from the current range
10            farthest = Math.max(farthest, i + nums[i]);
11
12            // We have reached the end of the current jump
13            if (i == currentEnd) {
14                jumps++;
15                currentEnd = farthest;
16            }
17        }
18
19        return jumps;
20    }
21}
22