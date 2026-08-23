// Last updated: 23/08/2026, 11:29:39
1import java.util.*;
2
3class Solution {
4    public List<List<String>> groupAnagrams(String[] strs) {
5
6        Map<String, List<String>> map = new HashMap<>();
7
8        for (String str : strs) {
9
10            // Count frequency of each character
11            int[] count = new int[26];
12
13            for (char c : str.toCharArray()) {
14                count[c - 'a']++;
15            }
16
17            // Create a unique key from the frequency array
18            StringBuilder key = new StringBuilder();
19
20            for (int i = 0; i < 26; i++) {
21                key.append('#');
22                key.append(count[i]);
23            }
24
25            // Add string to its anagram group
26            map.computeIfAbsent(key.toString(), k -> new ArrayList<>())
27               .add(str);
28        }
29
30        return new ArrayList<>(map.values());
31    }
32}
33