// Last updated: 18/07/2026, 21:54:14
1class Solution {
2    public int singleNumber(int[] nums) {
3
4        int result = 0;
5
6        for (int i = 0; i < nums.length; i++) {
7            result = result ^ nums[i];
8        }
9
10        return result;
11    }
12}