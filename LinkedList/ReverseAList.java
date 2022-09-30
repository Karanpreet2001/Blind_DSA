package LinkedList;
import java.util.LinkedList;

//Given the head of a singly linked list, reverse the list, and return the reversed list.

public class ReverseAList {
    

    public static void main(String[] args) {
       
    }

    // Time complex = 0(1) && Space - 0(1)
    ListNode reverseAList(ListNode head){
        ListNode curr = head;
        ListNode prev = null;

        while( curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr= temp;
        }

        return prev;
    }
}
