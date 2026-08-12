// Last updated: 12/08/2026, 09:29:10
1class Solution {
2    public boolean isPalindrome(String s) {
3        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
4        s = s.replaceAll(" ","");
5        String reversed = new StringBuilder(s).reverse().toString();
6        if(s.equals(reversed)){
7            return true;
8        }
9        else if(s.length()==0){
10            return true;
11        }
12
13        return false;
14        
15    }
16
17}