// Last updated: 23/08/2026, 09:36:05
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> generate(int numRows) {
5        List<List<Integer>> result = new ArrayList<>();
6
7        for (int i = 0; i < numRows; i++) {
8            List<Integer> row = new ArrayList<>();
9
10            // First element is always 1
11            row.add(1);
12
13            // Middle elements
14            for (int j = 1; j < i; j++) {
15                int value = result.get(i - 1).get(j - 1)
16                         + result.get(i - 1).get(j);
17                row.add(value);
18            }
19
20            // Last element is always 1
21            if (i > 0) {
22                row.add(1);
23            }
24
25            result.add(row);
26        }
27
28        return result;
29    }
30}
31