// Last updated: 23/08/2026, 09:41:40
1import java.util.*;
2
3class Solution {
4    public String simplifyPath(String path) {
5        String[] parts = path.split("/");
6        Stack<String> stack = new Stack<>();
7
8        for (String part : parts) {
9            if (part.equals("") || part.equals(".")) {
10                // Ignore empty parts and current directory
11                continue;
12            }
13
14            if (part.equals("..")) {
15                // Go to parent directory if possible
16                if (!stack.isEmpty()) {
17                    stack.pop();
18                }
19            } else {
20                // Valid directory/file name
21                stack.push(part);
22            }
23        }
24
25        // Build the canonical path
26        StringBuilder result = new StringBuilder();
27
28        for (String dir : stack) {
29            result.append("/").append(dir);
30        }
31
32        return result.length() == 0 ? "/" : result.toString();
33    }
34}
35