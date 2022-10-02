package LinkedList;
// Linked List Cycle

//  Given head, the head of a linked list, determine 
// if the linked list has a cycle in it.

public class LinkedListCycle {
    
    public static void main(String[] args) {
        
    }
    // time complex = 0(N) & space O(1)
    public boolean hasCycle(ListNode head) {
        
        
        if(head == null) return false;
        
        ListNode slow = head, fast= head.next;
        
        while(slow != fast){
            
            if( fast == null || fast.next == null) 
                return false;
            
            
            slow= slow.next;
            fast = fast.next.next;
        }
        
        return true;
    }
}
