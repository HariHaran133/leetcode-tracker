// Last updated: 23/08/2026, 11:37:51
1import java.util.*;
2
3class Solution {
4    public List<Integer> spiralOrder(int[][] matrix) {
5        List<Integer> result = new ArrayList<>();
6
7        int top = 0;
8        int bottom = matrix.length - 1;
9        int left = 0;
10        int right = matrix[0].length - 1;
11
12        while (top <= bottom && left <= right) {
13
14            // 1. Traverse from left to right
15            for (int col = left; col <= right; col++) {
16                result.add(matrix[top][col]);
17            }
18            top++;
19
20            // 2. Traverse from top to bottom
21            for (int row = top; row <= bottom; row++) {
22                result.add(matrix[row][right]);
23            }
24            right--;
25
26            // 3. Traverse from right to left
27            if (top <= bottom) {
28                for (int col = right; col >= left; col--) {
29                    result.add(matrix[bottom][col]);
30                }
31                bottom--;
32            }
33
34            // 4. Traverse from bottom to top
35            if (left <= right) {
36                for (int row = bottom; row >= top; row--) {
37                    result.add(matrix[row][left]);
38                }
39                left++;
40            }
41        }
42
43        return result;
44    }
45}
46