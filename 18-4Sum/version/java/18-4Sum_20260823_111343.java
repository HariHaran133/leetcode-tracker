// Last updated: 23/08/2026, 11:13:43
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> fourSum(int[] nums, long target) {
5        List<List<Integer>> result = new ArrayList<>();
6
7        Arrays.sort(nums);
8        int n = nums.length;
9
10        for (int i = 0; i < n - 3; i++) {
11
12            // Skip duplicate first elements
13            if (i > 0 && nums[i] == nums[i - 1]) {
14                continue;
15            }
16
17            for (int j = i + 1; j < n - 2; j++) {
18
19                // Skip duplicate second elements
20                if (j > i + 1 && nums[j] == nums[j - 1]) {
21                    continue;
22                }
23
24                int left = j + 1;
25                int right = n - 1;
26
27                while (left < right) {
28                    long sum = (long) nums[i]
29                             + nums[j]
30                             + nums[left]
31                             + nums[right];
32
33                    if (sum == target) {
34                        result.add(Arrays.asList(
35                            nums[i],
36                            nums[j],
37                            nums[left],
38                            nums[right]
39                        ));
40
41                        // Skip duplicates
42                        while (left < right && nums[left] == nums[left + 1]) {
43                            left++;
44                        }
45
46                        while (left < right && nums[right] == nums[right - 1]) {
47                            right--;
48                        }
49
50                        left++;
51                        right--;
52
53                    } else if (sum < target) {
54                        left++;
55                    } else {
56                        right--;
57                    }
58                }
59            }
60        }
61
62        return result;
63    }
64}
65