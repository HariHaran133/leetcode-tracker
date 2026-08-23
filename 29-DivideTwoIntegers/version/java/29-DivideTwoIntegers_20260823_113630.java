// Last updated: 23/08/2026, 11:36:30
1class Solution {
2    public int divide(int dividend, int divisor) {
3
4        // Overflow case
5        if (dividend == Integer.MIN_VALUE && divisor == -1) {
6            return Integer.MAX_VALUE;
7        }
8
9        // Determine the sign of the result
10        boolean negative = (dividend < 0) ^ (divisor < 0);
11
12        // Use long to safely handle Integer.MIN_VALUE
13        long a = Math.abs((long) dividend);
14        long b = Math.abs((long) divisor);
15
16        long quotient = 0;
17
18        // Subtract the largest possible multiples
19        while (a >= b) {
20
21            long value = b;
22            long multiple = 1;
23
24            // Double divisor using bit shifting
25            while (value <= (a >> 1)) {
26                value <<= 1;
27                multiple <<= 1;
28            }
29
30            a -= value;
31            quotient += multiple;
32        }
33
34        // Apply sign
35        if (negative) {
36            quotient = -quotient;
37        }
38
39        // Clamp to 32-bit integer range
40        if (quotient > Integer.MAX_VALUE) {
41            return Integer.MAX_VALUE;
42        }
43
44        if (quotient < Integer.MIN_VALUE) {
45            return Integer.MIN_VALUE;
46        }
47
48        return (int) quotient;
49    }
50}
51