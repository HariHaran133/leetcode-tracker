// Last updated: 27/08/2026, 10:25:47
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        HashMap<Character,Integer> map = new HashMap<>();
4
5        if(s.length()!=t.length()){
6            return false;
7        }
8
9        for(int i=0;i<s.length();i++){
10            char c = s.charAt(i);
11            map.put(c,map.getOrDefault(c,0)+1);
12        }
13
14        for(int j=0;j<t.length();j++){
15            char a = t.charAt(j);
16            if(!map.containsKey(a)){
17                return false;
18            }
19
20            map.put(a,map.get(a)-1);
21
22            if(map.get(a)<0){
23                return false;
24            }
25        }
26        return true;
27        
28        
29    }
30}