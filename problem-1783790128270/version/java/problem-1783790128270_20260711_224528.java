// Last updated: 11/07/2026, 22:45:28
1class Solution {
2    public int[][] modifiedMatrix(int[][] matrix) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5
6        
7        int[] maxCol = new int[n];
8
9        for (int j = 0; j < n; j++) {
10            maxCol[j] = Integer.MIN_VALUE;
11
12            for (int i = 0; i < m; i++) {
13                maxCol[j] = Math.max(maxCol[j], matrix[i][j]);
14            }
15        }
16
17        
18        for (int i = 0; i < m; i++) {
19            for (int j = 0; j < n; j++) {
20                if (matrix[i][j] == -1) {
21                    matrix[i][j] = maxCol[j];
22                }
23            }
24        }
25
26        return matrix;
27        
28    }
29}