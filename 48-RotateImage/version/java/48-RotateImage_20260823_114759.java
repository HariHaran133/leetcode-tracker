// Last updated: 23/08/2026, 11:47:59
1class Solution {
2    public void rotate(int[][] matrix) {
3        int n = matrix.length;
4
5        // Step 1: Transpose the matrix
6        for (int i = 0; i < n; i++) {
7            for (int j = i + 1; j < n; j++) {
8
9                int temp = matrix[i][j];
10                matrix[i][j] = matrix[j][i];
11                matrix[j][i] = temp;
12            }
13        }
14
15        // Step 2: Reverse every row
16        for (int i = 0; i < n; i++) {
17            int left = 0;
18            int right = n - 1;
19
20            while (left < right) {
21                int temp = matrix[i][left];
22                matrix[i][left] = matrix[i][right];
23                matrix[i][right] = temp;
24
25                left++;
26                right--;
27            }
28        }
29    }
30}
31