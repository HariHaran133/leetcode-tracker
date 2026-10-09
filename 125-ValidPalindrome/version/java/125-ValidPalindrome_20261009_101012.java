// Last updated: 09/10/2026, 10:10:12
1class Solution {
2    public boolean isPalindrome(String s) {
3        s = s.replaceAll("[^a-zA-Z0-9]","");
4        s= s.replaceAll(" ","");
5        s = s.toLowerCase();
6        int left = 0;
7        int right = s.length()-1;
8        while(left<right){
9            if(s.charAt(left)!=s.charAt(right)){
10                return false;
11            }
12            left++;
13            right--;
14        }
15        return true;
16    }
17}