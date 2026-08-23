// Last updated: 23/08/2026, 09:47:58
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> subsets(int[] nums) {
5        List<List<Integer>> result = new ArrayList<>();
6        List<Integer> current = new ArrayList<>();
7
8        backtrack(0, nums, current, result);
9
10        return result;
11    }
12
13    private void backtrack(int start, int[] nums,
14                           List<Integer> current,
15                           List<List<Integer>> result) {
16
17        // Add the current subset
18        result.add(new ArrayList<>(current));
19
20        // Try adding each remaining number
21        for (int i = start; i < nums.length; i++) {
22            current.add(nums[i]);
23
24            // Move to the next index
25            backtrack(i + 1, nums, current, result);
26
27            // Backtrack
28            current.remove(current.size() - 1);
29        }
30    }
31}
32