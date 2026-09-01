// Last updated: 01/09/2026, 22:14:53
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        HashMap<String, List<String>> map = new HashMap<>();
4
5        for (String word : strs) {
6
7            char[] chars = word.toCharArray();
8
9            Arrays.sort(chars);
10
11            String key = new String(chars);
12
13            if (!map.containsKey(key)) {
14                map.put(key, new ArrayList<>());
15            }
16
17            map.get(key).add(word);
18        }
19
20        return new ArrayList<>(map.values());
21        
22    }
23}