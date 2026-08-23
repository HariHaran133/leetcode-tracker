// Last updated: 23/08/2026, 11:16:27
1class Solution {
2    public ListNode rotateRight(ListNode head, int k) {
3        // Empty list or single node
4        if (head == null || head.next == null || k == 0) {
5            return head;
6        }
7
8        // Find length and the tail
9        int length = 1;
10        ListNode tail = head;
11
12        while (tail.next != null) {
13            tail = tail.next;
14            length++;
15        }
16
17        // Avoid unnecessary rotations
18        k = k % length;
19
20        if (k == 0) {
21            return head;
22        }
23
24        // Make the list circular
25        tail.next = head;
26
27        // Find the new tail
28        int stepsToNewTail = length - k;
29        ListNode newTail = head;
30
31        for (int i = 1; i < stepsToNewTail; i++) {
32            newTail = newTail.next;
33        }
34
35        // New head is after the new tail
36        ListNode newHead = newTail.next;
37
38        // Break the circular list
39        newTail.next = null;
40
41        return newHead;
42    }
43}
44