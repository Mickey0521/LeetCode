/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode a = l1; //to the head of the 1st list
        ListNode b = l2; //to the head of the 2nd list
        
        ListNode list_head = new ListNode(0); //"new" the head of our list
        ListNode list_current = list_head;    //"current" to the head of our list
                       
        int overload =0; //carry

        while(a != null || b != null){ //any one is not null
            
            int a_digit;
            int b_digit;
            int sum;

            if(a == null){ //if a is null
                a_digit = 0;
            }
            else{ 
                a_digit = a.val;
                a = a.next;
            }
            
            if(b == null){ //if b is null
                b_digit =0;
            }
            else{
                b_digit = b.val;
                b = b.next;
            }
            
            sum = a_digit + b_digit + overload; //note: also add overload(carry)
            
            if(overload == 1)
                overload =0;
            
            if(sum >= 10){
                sum = sum -10;
                overload = 1;
            }
            
            list_current.val = sum; //the current value
            
            if(a == null && b == null){}
            else{            
                list_current.next = new ListNode(0); //"new" the next node
                list_current = list_current.next;    //"current" to the next node
            }
        }
        //note: the special case, when a and b are both null, and there is an overload
        if(overload ==1){
            list_current.next = new ListNode(1); //"new" the next node with "1"
            list_current = list_current.next;    //"current" to the next node
        }
        return list_head; //note: return the "head" of our linked list
    }
}
