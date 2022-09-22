class Solution {
private int nthNode=0;
public ListNode removeNthFromEnd(ListNode head, int n) {
if(head==null) return head;
head.next = removeNthFromEnd(head.next, n);
nthNode++;
if(nthNode==n) return head.next;
return head;
}
}
