class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int ans[]=new int[2];
        int count=0, lines=0;
        for(int i=0;i<s.length();i++){
            if(count+widths[s.charAt(i)-'a']>100){
                count=0; lines++; i--;
            }
            else count+=widths[s.charAt(i)-'a'];
        }
        ans[0]=lines+1; ans[1]=count;
        return ans;
    }
}