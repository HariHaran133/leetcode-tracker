// Last updated: 23/08/2026, 09:57:28
1class Solution {
2    public boolean isSameTree(TreeNode p, TreeNode q) {
3
4        // Both nodes are null
5        if (p == null && q == null) {
6            return true;
7        }
8
9        // One node is null, the other is not
10        if (p == null || q == null) {
11            return false;
12        }
13
14        // Values are different
15        if (p.val != q.val) {
16            return false;
17        }
18
19        // Check left and right subtrees
20        return isSameTree(p.left, q.left)
21                && isSameTree(p.right, q.right);
22    }
23}
24