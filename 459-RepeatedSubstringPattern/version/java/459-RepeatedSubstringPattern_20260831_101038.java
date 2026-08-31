// Last updated: 31/08/2026, 10:10:38
1class Solution {
2    public boolean repeatedSubstringPattern(String s) {
3
4        int n = s.length();
5
6        for (int len = 1; len <= n / 2; len++) {
7
8            if (n % len != 0) {
9                continue;
10            }
11
12            String sub = s.substring(0, len);
13
14            boolean repeated = true;
15
16            for (int i = len; i < n; i++) {
17
18                if (s.charAt(i) != sub.charAt(i % len)) {
19                    repeated = false;
20                    break;
21                }
22            }
23
24            if (repeated) {
25                return true;
26            }
27        }
28
29        return false;
30    }
31}