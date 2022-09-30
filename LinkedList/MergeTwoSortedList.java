package LinkedList;
// Merge Two Sorted Lists

//You are given the heads of two sorted linked lists list1 and list2.

//Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

//Return the head of the merged linked list.



//Input: list1 = [1,2,4], list2 = [1,3,4]
//Output: [1,1,2,3,4,4]

public class MergeTwoSortedList {
    

    public static void main(String[] args) {
        
    }

    // Time complex - 0(N) Space 
    ListNode mergeTwoSortedList(ListNode l1, ListNode l2){

        ListNode new_head=null , merged = null;
        if(l1 == null){
            return l2;
        }

        if(l2 == null){
            return l1;
        }

        if(l1.val < l2.val){
            merged = l1;
            l1 = l1.next;
        }else{
            merged = l2;
            l2 = l2.next;
        }

        new_head = merged;

        while(l1 != null && l2 != null){
            if(l1.val > l2.val){
                merged.next = l2;
                merged = l2;
                l2= l2.next;
            }else{
                merged.next = l1;
                merged = l1;
                l1= l1.next;
            }
        }

        if(l1 == null){
            merged.next = l2;
        }

        if(l2 == null){
            merged.next = l1;
        }

        return new_head;
    }
}
