// Last updated: 23/08/2026, 10:50:08
1import java.util.*;
2
3class Solution {
4    public int minDepth(TreeNode root) {
5        if (root == null) {
6            return 0;
7        }
8
9        Queue<TreeNode> queue = new LinkedList<>();
10        queue.offer(root);
11
12        int depth = 1;
13
14        while (!queue.isEmpty()) {
15            int size = queue.size();
16
17            for (int i = 0; i < size; i++) {
18                TreeNode node = queue.poll();
19
20                // First leaf found = minimum depth
21                if (node.left == null && node.right == null) {
22                    return depth;
23                }
24
25                if (node.left != null) {
26                    queue.offer(node.left);
27                }
28
29                if (node.right != null) {
30                    queue.offer(node.right);
31                }
32            }
33
34            depth++;
35        }
36
37        return depth;
38    }
39}
40