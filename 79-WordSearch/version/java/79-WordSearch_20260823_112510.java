// Last updated: 23/08/2026, 11:25:10
1class Solution {
2
3    public boolean exist(char[][] board, String word) {
4        int m = board.length;
5        int n = board[0].length;
6
7        for (int i = 0; i < m; i++) {
8            for (int j = 0; j < n; j++) {
9
10                if (board[i][j] == word.charAt(0)) {
11                    if (dfs(board, word, i, j, 0)) {
12                        return true;
13                    }
14                }
15            }
16        }
17
18        return false;
19    }
20
21    private boolean dfs(char[][] board, String word,
22                        int row, int col, int index) {
23
24        // All characters matched
25        if (index == word.length()) {
26            return true;
27        }
28
29        // Out of bounds
30        if (row < 0 || row >= board.length ||
31            col < 0 || col >= board[0].length) {
32            return false;
33        }
34
35        // Current cell doesn't match
36        if (board[row][col] != word.charAt(index)) {
37            return false;
38        }
39
40        // Mark the cell as visited
41        char original = board[row][col];
42        board[row][col] = '#';
43
44        // Explore 4 directions
45        boolean found =
46                dfs(board, word, row + 1, col, index + 1) ||
47                dfs(board, word, row - 1, col, index + 1) ||
48                dfs(board, word, row, col + 1, index + 1) ||
49                dfs(board, word, row, col - 1, index + 1);
50
51        // Restore the cell (backtracking)
52        board[row][col] = original;
53
54        return found;
55    }
56}
57