// Last updated: 23/08/2026, 11:26:33
1class Solution {
2    public ListNode removeNthFromEnd(ListNode head, int n) {
3
4        // Dummy node handles the case where we remove the head
5        ListNode dummy = new ListNode(0);
6        dummy.next = head;
7
8        ListNode fast = dummy;
9        ListNode slow = dummy;
10
11        // Move fast n + 1 steps ahead
12        for (int i = 0; i <= n; i++) {
13            fast = fast.next;
14        }
15
16        // Move both pointers until fast reaches the end
17        while (fast != null) {
18            fast = fast.next;
19            slow = slow.next;
20        }
21
22        // Remove the nth node from the end
23        slow.next = slow.next.next;
24
25        return dummy.next;
26    }
27}
28