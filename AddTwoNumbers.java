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
        
        ListNode result = null;
        ListNode tail = result;
        int add = 0;
        
        while (null != l1 || null != l2 || add == 1) {
            
            int sum = (null != l1 ? l1.val : 0) + (null != l2 ? l2.val : 0) + add;
            
            ListNode newTail = new ListNode(sum > 9 ? sum - 10 : sum);
            
            if (result == null) {
                result = tail = newTail;
            } else {
                tail.next = newTail;
                tail = newTail;
            }

            l1 = null != l1 ? l1.next : null;
            l2 = null != l2 ? l2.next : null;

            add = sum > 9 ? 1 : 0;
        }
        
        return result;
    }
}
