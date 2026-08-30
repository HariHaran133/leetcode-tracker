// Last updated: 30/08/2026, 22:39:16
1class Solution {
2    public int compress(char[] chars) {
3
4        int left = 0;
5        int right = 0;
6        int write = 0;
7
8        while (right < chars.length) {
9
10            char current = chars[right];
11
12            // Find the end of the current group
13            while (right < chars.length && chars[right] == current) {
14                right++;
15            }
16
17            // Number of characters in the group
18            int count = right - left;
19
20            // Write the character
21            chars[write++] = current;
22
23            // Write the count
24            if (count > 1) {
25                String countStr = String.valueOf(count);
26
27                for (char c : countStr.toCharArray()) {
28                    chars[write++] = c;
29                }
30            }
31
32            // Move left to the beginning of the next group
33            left = right;
34        }
35
36        return write;
37    }
38}