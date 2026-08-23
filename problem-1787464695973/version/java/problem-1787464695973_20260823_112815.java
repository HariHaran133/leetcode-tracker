// Last updated: 23/08/2026, 11:28:15
1class Solution {
2    public String multiply(String num1, String num2) {
3
4        // If either number is zero
5        if (num1.equals("0") || num2.equals("0")) {
6            return "0";
7        }
8
9        int m = num1.length();
10        int n = num2.length();
11
12        int[] result = new int[m + n];
13
14        // Multiply each digit
15        for (int i = m - 1; i >= 0; i--) {
16            for (int j = n - 1; j >= 0; j--) {
17
18                int digit1 = num1.charAt(i) - '0';
19                int digit2 = num2.charAt(j) - '0';
20
21                int product = digit1 * digit2;
22
23                int pos1 = i + j;
24                int pos2 = i + j + 1;
25
26                int sum = product + result[pos2];
27
28                result[pos2] = sum % 10;
29                result[pos1] += sum / 10;
30            }
31        }
32
33        // Convert result array to string
34        StringBuilder sb = new StringBuilder();
35
36        int i = 0;
37
38        // Skip leading zeros
39        while (i < result.length && result[i] == 0) {
40            i++;
41        }
42
43        while (i < result.length) {
44            sb.append(result[i]);
45            i++;
46        }
47
48        return sb.toString();
49    }
50}
51