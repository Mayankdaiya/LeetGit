class ReverseInteger {
    public int reverse(int x) {
        int r=0;
        while(x!=0){
            if(r>Integer.MAX_VALUE/10 || (r==Integer.MAX_VALUE/10 && x%10>7)){
                return 0;
            }
            if(r<Integer.MIN_VALUE/10 || (r==Integer.MIN_VALUE/10 && x%10<-8)){
                return 0;
            }
            r=r*10 + x%10;
            x/=10;
        }
        return r;
    }
}