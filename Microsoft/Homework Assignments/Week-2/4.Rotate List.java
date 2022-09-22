class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        
        int len = 1;
        ListNode newHead = head;
        ListNode tail = head;
        
        while(tail.next != null) {
            tail = tail.next;
            len++;
        }
        tail.next = head;
       
        k = k % len;
       
        for(int i=0; i<len-k; i++)
            tail = tail.next;
            newHead = tail.next;
            tail.next = null;
            return newHead;
    }
}

