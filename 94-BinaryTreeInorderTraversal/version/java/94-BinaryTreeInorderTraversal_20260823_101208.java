// Last updated: 23/08/2026, 10:12:08
1import java.util.*;
2
3class Solution {
4    public List<Integer> inorderTraversal(TreeNode root) {
5        List<Integer> result = new ArrayList<>();
6        Stack<TreeNode> stack = new Stack<>();
7
8        TreeNode current = root;
9
10        while (current != null || !stack.isEmpty()) {
11
12            // Go as far left as possible
13            while (current != null) {
14                stack.push(current);
15                current = current.left;
16            }
17
18            // Process the node
19            current = stack.pop();
20            result.add(current.val);
21
22            // Move to the right subtree
23            current = current.right;
24        }
25
26        return result;
27    }
28}
29