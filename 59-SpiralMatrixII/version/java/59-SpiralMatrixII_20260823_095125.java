// Last updated: 23/08/2026, 09:51:25
1class Solution {
2    public int[][] generateMatrix(int n) {
3        int[][] matrix = new int[n][n];
4
5        int top = 0;
6        int bottom = n - 1;
7        int left = 0;
8        int right = n - 1;
9        int num = 1;
10
11        while (top <= bottom && left <= right) {
12
13            // Left to right
14            for (int i = left; i <= right; i++) {
15                matrix[top][i] = num++;
16            }
17            top++;
18
19            // Top to bottom
20            for (int i = top; i <= bottom; i++) {
21                matrix[i][right] = num++;
22            }
23            right--;
24
25            // Right to left
26            if (top <= bottom) {
27                for (int i = right; i >= left; i--) {
28                    matrix[bottom][i] = num++;
29                }
30                bottom--;
31            }
32
33            // Bottom to top
34            if (left <= right) {
35                for (int i = bottom; i >= top; i--) {
36                    matrix[i][left] = num++;
37                }
38                left++;
39            }
40        }
41
42        return matrix;
43    }
44}
45