// Last updated: 02/09/2026, 23:26:44
1class Solution {
2    public String minWindow(String s, String t) {
3        if (s.length() < t.length()) {
4            return "";
5        }
6
7        int[] freq = new int[128];
8
9        // Store required character frequencies
10        for (char c : t.toCharArray()) {
11            freq[c]++;
12        }
13
14        int left = 0;
15        int right = 0;
16
17        int required = t.length();
18        int minLength = Integer.MAX_VALUE;
19        int start = 0;
20
21        while (right < s.length()) {
22
23            char c = s.charAt(right);
24
25            // If this character is still needed
26            if (freq[c] > 0) {
27                required--;
28            }
29
30            freq[c]--;
31            right++;
32
33            // Window contains all characters of t
34            while (required == 0) {
35
36                // Update minimum window
37                if (right - left < minLength) {
38                    minLength = right - left;
39                    start = left;
40                }
41
42                char leftChar = s.charAt(left);
43
44                freq[leftChar]++;
45
46                // Removing a required character makes window invalid
47                if (freq[leftChar] > 0) {
48                    required++;
49                }
50
51                left++;
52            }
53        }
54
55        return minLength == Integer.MAX_VALUE
56                ? ""
57                : s.substring(start, start + minLength);
58        
59    }
60}