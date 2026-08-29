// Last updated: 29/08/2026, 11:36:01
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        for(int i=0;i<strs[0].length();i++){
4            char current = strs[0].charAt(i);
5
6            for(int j=1;j<strs.length;j++){
7                if(i>=strs[j].length()||strs[j].charAt(i)!=current){
8                    return strs[0].substring(0,i);
9                }
10            }
11        }
12        return strs[0];
13    }
14}