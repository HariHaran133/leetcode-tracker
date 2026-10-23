// Last updated: 23/10/2026, 21:20:45
1class Solution {
2    public int compress(char[] chars) {
3        int left = 0;
4        int right = 1;
5        String s = "";
6
7        while (left < chars.length) {
8            int count = 1;
9
10            while (right < chars.length && chars[left] == chars[right]) {
11                count++;
12                right++;
13            }
14
15            s = s + chars[left];
16
17            if (count > 1) {
18                s = s + count;
19            }
20
21            left = right;
22            right = left + 1;
23        }
24
25        char[] ans = s.toCharArray();
26
27        for (int i = 0; i < ans.length; i++) {
28            chars[i] = ans[i];
29        }
30
31        return ans.length;
32    }
33}