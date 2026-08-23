// Last updated: 23/08/2026, 09:45:33
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> combine(int n, int k) {
5        List<List<Integer>> result = new ArrayList<>();
6        List<Integer> current = new ArrayList<>();
7
8        backtrack(1, n, k, current, result);
9
10        return result;
11    }
12
13    private void backtrack(int start, int n, int k,
14                           List<Integer> current,
15                           List<List<Integer>> result) {
16
17        // Combination is complete
18        if (current.size() == k) {
19            result.add(new ArrayList<>(current));
20            return;
21        }
22
23        // Try every possible number
24        for (int i = start; i <= n; i++) {
25            current.add(i);
26
27            // Choose the next number from i + 1
28            backtrack(i + 1, n, k, current, result);
29
30            // Backtrack
31            current.remove(current.size() - 1);
32        }
33    }
34}
35
36