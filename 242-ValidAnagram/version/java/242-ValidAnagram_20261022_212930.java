// Last updated: 22/10/2026, 21:29:30
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        int[] freq = new int[26];
4        for(char x: s.toCharArray()){
5            freq[x-'a']++;
6        }
7        for(char y: t.toCharArray()){
8            freq[y-'a']--;
9        }
10        for(int a: freq){
11            if(a!=0){
12                return false;
13            }
14        }
15        return true;
16        
17    }
18}