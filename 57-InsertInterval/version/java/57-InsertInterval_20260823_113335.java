// Last updated: 23/08/2026, 11:33:35
1import java.util.*;
2
3class Solution {
4    public int[][] insert(int[][] intervals, int[] newInterval) {
5
6        List<int[]> result = new ArrayList<>();
7
8        int i = 0;
9        int n = intervals.length;
10
11        // 1. Add intervals that come before newInterval
12        while (i < n && intervals[i][1] < newInterval[0]) {
13            result.add(intervals[i]);
14            i++;
15        }
16
17        // 2. Merge overlapping intervals
18        while (i < n && intervals[i][0] <= newInterval[1]) {
19            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
20            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
21            i++;
22        }
23
24        // Add the merged interval
25        result.add(newInterval);
26
27        // 3. Add intervals that come after newInterval
28        while (i < n) {
29            result.add(intervals[i]);
30            i++;
31        }
32
33        return result.toArray(new int[result.size()][]);
34    }
35}
36