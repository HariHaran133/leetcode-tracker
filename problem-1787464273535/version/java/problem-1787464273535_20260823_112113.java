// Last updated: 23/08/2026, 11:21:13
1class Solution {
2    public int singleNumber(int[] nums) {
3        int result = 0;
4
5        // Check all 32 bits of an integer
6        for (int bit = 0; bit < 32; bit++) {
7            int count = 0;
8
9            for (int num : nums) {
10                // Check whether this bit is set
11                if ((num & (1 << bit)) != 0) {
12                    count++;
13                }
14            }
15
16            // The single number contributes the remaining bit
17            if (count % 3 != 0) {
18                result |= (1 << bit);
19            }
20        }
21
22        return result;
23    }
24}
25