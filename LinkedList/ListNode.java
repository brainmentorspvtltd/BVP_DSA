public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeTwoLists(ListNode start_1, ListNode start_2) {
        ListNode third;
        if(start_1 == null) {
            // print(start_2);
            return start_2;
        }
        if(start_2 == null) {
            // print(start_1);
            return start_1;
        }

        if(start_1.val <= start_2.val) {
            third = start_1;
            start_1 = start_1.next;
        }
        else {
            third = start_2;
            start_2 = start_2.next;
        }

        ListNode temp = third;
        while(start_1 != null && start_2 != null) {
            if(start_1.val <= start_2.val) {
                temp.next = start_1;
                temp = temp.next;
                start_1 = start_1.next;
            }
            else {
                temp.next = start_2;
                temp = temp.next;
                start_2 = start_2.next;
            }
        }
        if(start_1 == null) {
            temp.next = start_2;
        }
        else {
            temp.next = start_1;
        }
        return third;
    }
}