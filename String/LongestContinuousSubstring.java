public class LongestContinuousSubstring {
    public int longestContinuousSubstring(String s) {
        int ans=1, in=0, i=0;
        for(i=1;i<s.length();i++){
            if(s.charAt(i)-s.charAt(i-1)!=1){
                ans=Math.max(ans,i-in);
                in=i;
            }
        }
        ans=Math.max(ans,i-in);
        return ans;
    }
}