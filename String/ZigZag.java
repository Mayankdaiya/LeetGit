class Solution {
    public static String getString(String s,int in,int m){
        int st=2*(m-in)-2, en=in*2, f=0;
        String ret="";
        while(in<s.length()){
            ret+=s.charAt(in);
            if(f==0 && st!=0){
                if(en!=0) f=1;
                in+=st;
            }
            else if(en!=0){
                f=0;
                in+=en;
            }
        }
        return ret;
    }
    public String convert(String s, int n) {
        if(n==1 || s.length()==1) return s;
        String res="";
        for(int i=0;i<n;i++){
            res+=getString(s,i,n);
        }
        return res;
    }
}