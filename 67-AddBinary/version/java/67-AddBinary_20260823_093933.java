// Last updated: 23/08/2026, 09:39:33
1class Solution {
2    public String addBinary(String a, String b) {
3        StringBuilder result = new StringBuilder();
4
5        int i = a.length() - 1;
6        int j = b.length() - 1;
7        int carry = 0;
8
9        while (i >= 0 || j >= 0 || carry > 0) {
10            int sum = carry;
11
12            if (i >= 0) {
13                sum += a.charAt(i) - '0';
14                i--;
15            }
16
17            if (j >= 0) {
18                sum += b.charAt(j) - '0';
19                j--;
20            }
21
22            result.append(sum % 2);
23            carry = sum / 2;
24        }
25
26        return result.reverse().toString();
27    }
28}
29