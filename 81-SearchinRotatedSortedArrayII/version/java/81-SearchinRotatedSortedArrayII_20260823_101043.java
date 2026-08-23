// Last updated: 23/08/2026, 10:10:43
1class Solution {
2    public boolean search(int[] nums, int target) {
3        int left = 0;
4        int right = nums.length - 1;
5
6        while (left <= right) {
7            int mid = left + (right - left) / 2;
8
9            // Target found
10            if (nums[mid] == target) {
11                return true;
12            }
13
14            // When duplicates make it impossible to determine
15            // which side is sorted
16            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
17                left++;
18                right--;
19            }
20
21            // Left half is sorted
22            else if (nums[left] <= nums[mid]) {
23                if (nums[left] <= target && target < nums[mid]) {
24                    right = mid - 1;
25                } else {
26                    left = mid + 1;
27                }
28            }
29
30            // Right half is sorted
31            else {
32                if (nums[mid] < target && target <= nums[right]) {
33                    left = mid + 1;
34                } else {
35                    right = mid - 1;
36                }
37            }
38        }
39
40        return false;
41    }
42}
43