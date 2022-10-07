class Happy_Number {
    public boolean isHappy(int n) {
        if(n==1) return true;
        int prod=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(n!=0){
            int t=(int)Math.pow(n%10,2);
            prod+=t;
            n/=10;
            if(n==0){
                if(map.containsKey(prod)) return false;
                else if(prod==1) return true;
                map.put(prod,1);
                n=prod;
                prod=0;
            }
        }
        return false;
    }
}