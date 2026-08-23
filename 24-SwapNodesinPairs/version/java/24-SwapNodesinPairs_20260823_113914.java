// Last updated: 23/08/2026, 11:39:14
1class Solution {
2    public ListNode swapPairs(ListNode head) {
3
4        // Dummy node makes swapping the first pair easier
5        ListNode dummy = new ListNode(0);
6        dummy.next = head;
7
8        ListNode prev = dummy;
9
10        while (prev.next != null && prev.next.next != null) {
11
12            ListNode first = prev.next;
13            ListNode second = first.next;
14
15            // Swap the two nodes
16            first.next = second.next;
17            second.next = first;
18            prev.next = second;
19
20            // Move to the next pair
21            prev = first;
22        }
23
24        return dummy.next;
25    }
26}
27