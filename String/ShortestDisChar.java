class ShortestDisChar {
    public int[] shortestToChar(String s, char c) {
        int len=s.length();
        int in=-10000;
        int ans[]=new int[len];
        for(int i=0;i<len;i++){
            if(s.charAt(i)==c){
                in=i;
            }
            ans[i]=i-in;
        }
        in=10000;
        for(int i=len-1;i>=0;i--){
            if(s.charAt(i)==c){
                in=i;
            }
            ans[i]=Math.min(in-i,ans[i]);
        }
        return ans;
    }
}