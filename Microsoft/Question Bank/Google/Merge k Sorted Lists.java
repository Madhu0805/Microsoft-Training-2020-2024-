

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
         ListNode head=new ListNode(0);
       ListNode temp=head;
       List<Integer> ls=new ArrayList<>();
       
       for(ListNode node: lists){
         while(node!=null){
           ls.add(node.val);
             node=node.next;
         }         
       }
       Collections.sort(ls);
       for(int val: ls){
         temp.next=new ListNode(val);
         temp=temp.next;
       }
       return head.next;
    }
}
