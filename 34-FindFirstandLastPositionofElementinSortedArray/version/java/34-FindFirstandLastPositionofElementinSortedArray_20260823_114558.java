// Last updated: 23/08/2026, 11:45:58
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3
4        int first = findFirst(nums, target);
5
6        // Target doesn't exist
7        if (first == -1) {
8            return new int[]{-1, -1};
9        }
10
11        int last = findLast(nums, target);
12
13        return new int[]{first, last};
14    }
15
16    private int findFirst(int[] nums, int target) {
17
18        int left = 0;
19        int right = nums.length - 1;
20        int answer = -1;
21
22        while (left <= right) {
23
24            int mid = left + (right - left) / 2;
25
26            if (nums[mid] == target) {
27                answer = mid;
28
29                // Continue searching on the left
30                right = mid - 1;
31
32            } else if (nums[mid] < target) {
33                left = mid + 1;
34
35            } else {
36                right = mid - 1;
37            }
38        }
39
40        return answer;
41    }
42
43    private int findLast(int[] nums, int target) {
44
45        int left = 0;
46        int right = nums.length - 1;
47        int answer = -1;
48
49        while (left <= right) {
50
51            int mid = left + (right - left) / 2;
52
53            if (nums[mid] == target) {
54                answer = mid;
55
56                // Continue searching on the right
57                left = mid + 1;
58
59            } else if (nums[mid] < target) {
60                left = mid + 1;
61
62            } else {
63                right = mid - 1;
64            }
65        }
66
67        return answer;
68    }
69}
70