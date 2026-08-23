// Last updated: 23/08/2026, 10:14:59
1class Solution {
2    public int maxDepth(TreeNode root) {
3
4        // Empty tree
5        if (root == null) {
6            return 0;
7        }
8
9        // Find depth of left and right subtrees
10        int leftDepth = maxDepth(root.left);
11        int rightDepth = maxDepth(root.right);
12
13        // Return the larger depth + current node
14        return Math.max(leftDepth, rightDepth) + 1;
15    }
16}
17