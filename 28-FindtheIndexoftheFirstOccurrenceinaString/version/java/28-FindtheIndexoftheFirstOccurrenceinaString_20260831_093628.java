// Last updated: 31/08/2026, 09:36:28
1class Solution {
2    public int strStr(String haystack, String needle) {
3        int n = needle.length();
4        int left = 0;
5        int right = n-1;
6        while(right < haystack.length()){
7            if(haystack.substring(left,right+1).equals(needle)){
8                return left;
9            }
10            else if(!haystack.substring(left,right+1).equals(needle)){
11                left++;
12                right++;
13            }
14        }
15    return -1;
16        
17        
18    }
19}