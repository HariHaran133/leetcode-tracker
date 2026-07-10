// Last updated: 10/07/2026, 21:56:13
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3
4        Arrays.sort(nums);
5
6        List<List<Integer>> result = new ArrayList<>();
7
8        int n = nums.length;
9
10        for (int i = 0; i < n - 2; i++) {
11
12            
13            if (i > 0 && nums[i] == nums[i - 1]) {
14                continue;
15            }
16
17            int left = i + 1;
18            int right = n - 1;
19
20            while (left < right) {
21
22                int sum = nums[i] + nums[left] + nums[right];
23
24                if (sum == 0) {
25
26                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
27
28                    
29                    while (left < right && nums[left] == nums[left + 1]) {
30                        left++;
31                    }
32
33                   
34                    while (left < right && nums[right] == nums[right - 1]) {
35                        right--;
36                    }
37
38                    left++;
39                    right--;
40
41                } else if (sum < 0) {
42
43                    left++;
44
45                } else {
46
47                    right--;
48                }
49            }
50        }
51
52        return result;
53    }
54}
55        