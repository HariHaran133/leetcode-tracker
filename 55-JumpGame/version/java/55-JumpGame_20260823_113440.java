// Last updated: 23/08/2026, 11:34:40
1class Solution {
2    public boolean canJump(int[] nums) {
3        int farthest = 0;
4
5        for (int i = 0; i < nums.length; i++) {
6
7            // If current index is unreachable
8            if (i > farthest) {
9                return false;
10            }
11
12            // Update the farthest reachable index
13            farthest = Math.max(farthest, i + nums[i]);
14
15            // We can already reach the last index
16            if (farthest >= nums.length - 1) {
17                return true;
18            }
19        }
20
21        return true;
22    }
23}
24