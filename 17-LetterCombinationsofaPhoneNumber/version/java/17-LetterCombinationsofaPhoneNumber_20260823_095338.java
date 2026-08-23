// Last updated: 23/08/2026, 09:53:38
1import java.util.*;
2
3class Solution {
4    public List<String> letterCombinations(String digits) {
5        List<String> result = new ArrayList<>();
6
7        if (digits == null || digits.length() == 0) {
8            return result;
9        }
10
11        String[] phone = {
12            "",     "",     "abc",  "def",
13            "ghi",  "jkl",  "mno",  "pqrs",
14            "tuv",  "wxyz"
15        };
16
17        backtrack(0, digits, phone, new StringBuilder(), result);
18
19        return result;
20    }
21
22    private void backtrack(int index, String digits,
23                           String[] phone,
24                           StringBuilder current,
25                           List<String> result) {
26
27        // A complete combination is formed
28        if (index == digits.length()) {
29            result.add(current.toString());
30            return;
31        }
32
33        // Get letters for the current digit
34        String letters = phone[digits.charAt(index) - '0'];
35
36        for (char letter : letters.toCharArray()) {
37            current.append(letter);
38
39            // Move to the next digit
40            backtrack(index + 1, digits, phone, current, result);
41
42            // Backtrack
43            current.deleteCharAt(current.length() - 1);
44        }
45    }
46}
47