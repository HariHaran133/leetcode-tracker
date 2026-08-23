// Last updated: 23/08/2026, 09:49:31
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3        
4        ListNode current = head;
5
6        while (current != null && current.next != null) {
7            
8            if (current.val == current.next.val) {
9                // Skip the duplicate node
10                current.next = current.next.next;
11            } else {
12                // Move to the next node
13                current = current.next;
14            }
15        }
16
17        return head;
18    }
19}
20