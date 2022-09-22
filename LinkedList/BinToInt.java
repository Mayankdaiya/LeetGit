class BinToInt {
    int t=1;
    int valu=0;
    public int get(ListNode hd){
        if(hd==null){
            return 0;
        }
        get(hd.next);
        valu+=t*hd.val;
        t=t*2;
        return valu;
    }

    public int getDecimalValue(ListNode head) {
        int res=get(head);
        return res;
    }
}