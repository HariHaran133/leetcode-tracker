// Last updated: 12/07/2026, 22:36:53
1class Solution {
2    public int missingInteger(int[] nums) {
3        int sum = nums[0];
4
5        // Find sequential prefix sum
6        for (int i = 1; i < nums.length; i++) {
7
8            if (nums[i] == nums[i - 1] + 1) {
9                sum += nums[i];
10            } else {
11                break;
12            }
13        }
14
15        // Store all numbers
16        HashSet<Integer> set = new HashSet<>();
17
18        for (int num : nums) {
19            set.add(num);
20        }
21
22        // Find smallest missing integer >= sum
23        while (set.contains(sum)) {
24            sum++;
25        }
26
27        return sum;
28        
29    }
30}