// Last updated: 03/08/2026, 19:48:05
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        Arrays.sort(nums);
4
5        List<List<Integer>> result = new ArrayList<>();
6
7        int n = nums.length;
8
9        for (int i = 0; i < n - 2; i++) {
10
11            
12            if (i > 0 && nums[i] == nums[i - 1]) {
13                continue;
14            }
15
16            int left = i + 1;
17            int right = n - 1;
18
19            while (left < right) {
20
21                int sum = nums[i] + nums[left] + nums[right];
22
23                if (sum == 0) {
24
25                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
26
27                    
28                    while (left < right && nums[left] == nums[left + 1]) {
29                        left++;
30                    }
31
32                   
33                    while (left < right && nums[right] == nums[right - 1]) {
34                        right--;
35                    }
36
37                    left++;
38                    right--;
39
40                } else if (sum < 0) {
41
42                    left++;
43
44                } else {
45
46                    right--;
47                }
48            }
49        }
50
51        return result;
52    }
53}