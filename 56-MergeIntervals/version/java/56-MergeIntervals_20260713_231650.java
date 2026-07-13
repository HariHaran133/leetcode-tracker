// Last updated: 13/07/2026, 23:16:50
1
2
3class Solution {
4    public int[][] merge(int[][] intervals) {
5
6        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
7
8        int m = intervals.length;
9
10        int[][] nums = new int[m][2];
11
12        int index = 0;
13
14        nums[0][0] = intervals[0][0];
15        nums[0][1] = intervals[0][1];
16
17        for (int i = 1; i < m; i++) {
18
19            if (intervals[i][0] <= nums[index][1]) {
20
21                nums[index][1] = Math.max(nums[index][1], intervals[i][1]);
22
23            } else {
24
25                index++;
26
27                nums[index][0] = intervals[i][0];
28                nums[index][1] = intervals[i][1];
29            }
30        }
31
32        return Arrays.copyOf(nums, index + 1);
33    }
34}