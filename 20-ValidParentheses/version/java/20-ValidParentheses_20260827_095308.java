// Last updated: 27/08/2026, 09:53:08
1class Solution {
2    public boolean isValid(String s) {
3        Stack <Character> stack = new Stack<>();
4
5        for(int i=0;i<s.length();i++){
6            char c = s.charAt(i);
7
8            if(c=='('||c=='['||c=='{'){
9                stack.push(c);
10            }
11
12            else{
13                if (stack.isEmpty()){
14                    return false;
15                }
16
17                char top = stack.pop();
18                if(c==')'&&top!='('||c==']'&&top!='['||c=='}'&&top!='{')
19                {
20                    return false;
21                }
22            }
23        }
24        return stack.isEmpty();
25        
26    }
27}