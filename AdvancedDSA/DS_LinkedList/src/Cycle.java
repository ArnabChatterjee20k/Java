public class Cycle {
    /**
     * Definition for singly-linked list.
     */
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode fast = head, slow = head;

        while (fast != null && fast.next != null) {
            // move fast a head by 2
            fast = fast.next.next;
            slow = slow.next;

            // they meet
            if (fast == slow)
                return true;
        }
        // not meeting
        return false;
    }

    public int lengthOfCycle(ListNode head) {
        ListNode fast = head, slow = head;

        while (fast != null && fast.next != null) {
            // move fast a head by 2
            fast = fast.next.next;
            slow = slow.next;

            // they meet
            if (fast == slow) {
                // calculate the length
                ListNode temp = slow;
                int length = 0;

                // initially the temp will be slow so it will not run
                // we need to run atleast once
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);

                return length;
            }
        }
        // not meeting

        return 0;
    }
}
