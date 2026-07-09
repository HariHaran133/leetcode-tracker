// Last updated: 09/07/2026, 22:53:16
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3
4        int n = nums.length;
5
6        int[] answer = new int[n];
7
8        // Prefix products
9        answer[0] = 1;
10
11        for (int i = 1; i < n; i++) {
12            answer[i] = answer[i - 1] * nums[i - 1];
13        }
14
15        // Suffix product
16        int suffix = 1;
17
18        for (int i = n - 1; i >= 0; i--) {
19            answer[i] = answer[i] * suffix;
20            suffix = suffix * nums[i];
21        }
22
23        return answer;
24    }
25}