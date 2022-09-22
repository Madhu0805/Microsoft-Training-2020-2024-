public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null)
            return null;
        HashSet<ListNode> hset = new HashSet<>();
        ListNode temp = head;
        while(temp.next!=null)
        {
            if(hset.contains(temp))
                return temp;
            else
            {
                hset.add(temp);
                temp = temp.next;
            }
        }
        return null;
    }
}
