// Last updated: 23/08/2026, 11:51:42
1class Solution {
2    public int removeDuplicates(int[] nums) {
3
4        int k = 0;
5
6        for (int num : nums) {
7
8            // Keep the first two occurrences
9            if (k < 2 || num != nums[k - 2]) {
10                nums[k] = num;
11                k++;
12            }
13        }
14
15        return k;
16    }
17}
18