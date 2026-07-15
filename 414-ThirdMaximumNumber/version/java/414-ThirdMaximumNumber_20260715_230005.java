// Last updated: 15/07/2026, 23:00:05
1class Solution {
2    public int thirdMax(int[] nums) {
3
4        Long first = null;
5        Long second = null;
6        Long third = null;
7
8        for (int num : nums) {
9
10            // Ignore duplicates
11            if ((first != null && num == first) ||
12                (second != null && num == second) ||
13                (third != null && num == third)) {
14                continue;
15            }
16
17            if (first == null || num > first) {
18
19                third = second;
20                second = first;
21                first = (long) num;
22
23            } else if (second == null || num > second) {
24
25                third = second;
26                second = (long) num;
27
28            } else if (third == null || num > third) {
29
30                third = (long) num;
31            }
32        }
33
34        if (third == null)
35            return first.intValue();
36
37        return third.intValue();
38    }
39}