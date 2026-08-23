// Last updated: 23/08/2026, 11:49:39
1class Solution {
2    public ListNode partition(ListNode head, int x) {
3
4        // Dummy nodes for the two partitions
5        ListNode lessDummy = new ListNode(0);
6        ListNode greaterDummy = new ListNode(0);
7
8        ListNode less = lessDummy;
9        ListNode greater = greaterDummy;
10
11        ListNode current = head;
12
13        while (current != null) {
14
15            if (current.val < x) {
16                // Add to the less-than-x list
17                less.next = current;
18                less = less.next;
19            } else {
20                // Add to the greater-than-or-equal-x list
21                greater.next = current;
22                greater = greater.next;
23            }
24
25            current = current.next;
26        }
27
28        // End the greater list
29        greater.next = null;
30
31        // Connect the two partitions
32        less.next = greaterDummy.next;
33
34        return lessDummy.next;
35    }
36}
37