class RomanToInteger {

    public static int check(char ch)
    {
        if(ch=='I') return 1;
        else if(ch=='V') return 5;
        else if(ch=='X') return 10;
        else if(ch=='L') return 50;
        else if(ch=='C') return 100;
        else if(ch=='D') return 500;
        else return 1000;
    }

    public int romanToInt(String s) {
        int len=s.length();
        int ans=0;
        int pre=0;
        for(int i=len-1;i>=0;i--){
            char ch=s.charAt(i);
            int j=check(ch);
            if(j>=pre) ans+=check(ch);
            else ans=ans-j;
            pre=j;
        }
        return ans;
    }
}