/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        // StringBuilder sb=new StringBuilder();
        ListNode temp=head;
        int total=0;

        while(temp!=null){
            // sb.append(temp.val);
            total=temp.val+total*2;
            temp=temp.next;
        }
        return total;
        // int n=Integer.parseInt(sb.toString(),2);
        // return n;
    }
}