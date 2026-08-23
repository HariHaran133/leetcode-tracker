// Last updated: 23/08/2026, 10:13:37
1class Solution {
2    public boolean isSymmetric(TreeNode root) {
3        return isMirror(root.left, root.right);
4    }
5
6    private boolean isMirror(TreeNode left, TreeNode right) {
7        // Both are null
8        if (left == null && right == null) {
9            return true;
10        }
11
12        // One is null
13        if (left == null || right == null) {
14            return false;
15        }
16
17        // Values must be equal and subtrees must be mirrors
18        return left.val == right.val
19                && isMirror(left.left, right.right)
20                && isMirror(left.right, right.left);
21    }
22}
23