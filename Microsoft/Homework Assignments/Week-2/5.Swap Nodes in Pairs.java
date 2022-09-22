class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode t = head;
        while(t != null && t.next != null){
            int v = t.next.val;
            t.next.val = t.val;
            t.val = v;
            t = t.next.next;
        }
        return head;
    }
}
