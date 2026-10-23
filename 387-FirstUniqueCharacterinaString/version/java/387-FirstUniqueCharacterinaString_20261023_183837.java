// Last updated: 23/10/2026, 18:38:37
1class Solution {
2    public int firstUniqChar(String s) {
3        int[] arr = new int[26];
4        for(char x : s.toCharArray()){
5            arr[x - 'a']++;
6        }
7        for(int i=0;i<s.length();i++){
8            if(arr[s.charAt(i)-'a']==1){
9                return i;
10            }
11        }
12        
13        return -1;
14    
15    }
16}