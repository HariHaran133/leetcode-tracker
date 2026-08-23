// Last updated: 23/08/2026, 11:40:46
1import java.util.*;
2
3class Solution {
4    public int threeSumClosest(int[] nums, int target) {
5
6        Arrays.sort(nums);
7
8        int closestSum = nums[0] + nums[1] + nums[2];
9
10        for (int i = 0; i < nums.length - 2; i++) {
11
12            int left = i + 1;
13            int right = nums.length - 1;
14
15            while (left < right) {
16
17                int sum = nums[i] + nums[left] + nums[right];
18
19                // Found exact target
20                if (sum == target) {
21                    return sum;
22                }
23
24                // Update closest sum
25                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
26                    closestSum = sum;
27                }
28
29                // Move pointers
30                if (sum < target) {
31                    left++;
32                } else {
33                    right--;
34                }
35            }
36        }
37
38        return closestSum;
39    }
40}
41