// Last updated: 23/08/2026, 10:52:53
1import java.util.*;
2
3class Solution {
4    public boolean wordBreak(String s, List<String> wordDict) {
5        Set<String> words = new HashSet<>(wordDict);
6
7        // dp[i] = true if s.substring(0, i) can be segmented
8        boolean[] dp = new boolean[s.length() + 1];
9
10        dp[0] = true; // Empty string can be segmented
11
12        for (int i = 1; i <= s.length(); i++) {
13            for (int j = 0; j < i; j++) {
14
15                if (dp[j] && words.contains(s.substring(j, i))) {
16                    dp[i] = true;
17                    break;
18                }
19            }
20        }
21
22        return dp[s.length()];
23    }
24}
25