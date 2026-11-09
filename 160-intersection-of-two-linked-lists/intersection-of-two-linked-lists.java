public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            a = (a == null) ? headB : a.next; // ma na   ya  code  ma  ?  use ke ya because  ya  if  else  ke  tera  work ker ta ha
            b = (b == null) ? headA : b.next;
        }
        return a;
    }
}