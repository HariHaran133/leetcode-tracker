// Last updated: 23/08/2026, 11:12:12
1class Solution {
2    public int sumNumbers(TreeNode root) {
3        return dfs(root, 0);
4    }
5
6    private int dfs(TreeNode node, int currentNumber) {
7        if (node == null) {
8            return 0;
9        }
10
11        // Build the number represented by the current path
12        currentNumber = currentNumber * 10 + node.val;
13
14        // If it's a leaf, return the number
15        if (node.left == null && node.right == null) {
16            return currentNumber;
17        }
18
19        // Sum the numbers from both subtrees
20        return dfs(node.left, currentNumber)
21             + dfs(node.right, currentNumber);
22    }
23}
24
25