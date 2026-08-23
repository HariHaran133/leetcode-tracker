// Last updated: 23/08/2026, 11:19:46
1public class Solution {
2    public ListNode detectCycle(ListNode head) {
3        ListNode slow = head;
4        ListNode fast = head;
5
6        // Step 1: Detect whether a cycle exists
7        while (fast != null && fast.next != null) {
8            slow = slow.next;
9            fast = fast.next.next;
10
11            if (slow == fast) {
12                break;
13            }
14        }
15
16        // No cycle
17        if (fast == null || fast.next == null) {
18            return null;
19        }
20
21        // Step 2: Find the start of the cycle
22        ListNode start = head;
23
24        while (start != slow) {
25            start = start.next;
26            slow = slow.next;
27        }
28
29        return start;
30    }
31}
32