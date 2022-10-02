package LinkedList;
// Remove Nth Node From End of List


// Given the head of a linked list, remove the nth node from the 
// end of the list and return its head.

public class RemoveNthNodeFromEnd {
    

    public static void main(String[] args) {
        
    }

    ListNode removeNth(ListNode head, int position){
        ListNode dummy_head= new ListNode();

        dummy_head.next = head;
        
        ListNode slow= dummy_head;
        ListNode fast = dummy_head;

        for (int i = 0; i <= position + 1; i++) {
            fast = fast.next;
        }

        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy_head.next;
    }
}
