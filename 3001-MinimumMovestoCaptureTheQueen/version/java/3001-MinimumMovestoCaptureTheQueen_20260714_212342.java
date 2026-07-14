// Last updated: 14/07/2026, 21:23:42
1class Solution {
2    public int minMovesToCaptureTheQueen(int a, int b,
3                                         int c, int d,
4                                         int e, int f) {
5
6       
7        if (a == e) {
8            if (!(c == a &&
9                 ((b < d && d < f) || (f < d && d < b))))
10                return 1;
11        }
12
13        if (b == f) {
14            if (!(d == b &&
15                 ((a < c && c < e) || (e < c && c < a))))
16                return 1;
17        }
18
19        
20        if (Math.abs(c - e) == Math.abs(d - f)) {
21
22            if (!(((Math.abs(a - c) == Math.abs(b - d))) &&
23                 ((c < a && a < e) || (e < a && a < c)) &&
24                 ((d < b && b < f) || (f < b && b < d))))
25                return 1;
26        }
27
28        return 2;
29    }
30}