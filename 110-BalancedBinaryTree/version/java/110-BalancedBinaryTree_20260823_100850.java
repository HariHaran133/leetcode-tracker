// Last updated: 23/08/2026, 10:08:50
1class Solution {
2    public boolean isBalanced(TreeNode root) {
3        return height(root) != -1;
4    }
5
6    private int height(TreeNode node) {
7        // Empty tree is balanced
8        if (node == null) {
9            return 0;
10        }
11
12        // Check left subtree
13        int leftHeight = height(node.left);
14        if (leftHeight == -1) {
15            return -1;
16        }
17
18        // Check right subtree
19        int rightHeight = height(node.right);
20        if (rightHeight == -1) {
21            return -1;
22        }
23
24        // Difference in heights must be <= 1
25        if (Math.abs(leftHeight - rightHeight) > 1) {
26            return -1;
27        }
28
29        // Return height of current node
30        return Math.max(leftHeight, rightHeight) + 1;
31    }
32}
33