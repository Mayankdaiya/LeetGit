class Solution {
    public ListNode RemoveDuplicateSorted(ListNode head) {
        if(head==null)
            return null;
        Map<Integer, Integer> m=new HashMap<>();
        if(head.next==null)
            return head;
        m.put(head.val,1);
        ListNode curr=head;
        while(curr.next!=null){
            while(curr.next!=null && m.containsKey(curr.next.val)){
                if(curr.next.next!=null){
                    //System.out.println(curr.val);
                    curr.next=curr.next.next;
                }
                else{
                    curr.next=null;
                }

            }
            //System.out.println("c");
            if(curr.next!=null){
                m.put(curr.next.val,1);
                curr=curr.next;
            }

        }

        //head=curr;
        return head;
    }
}