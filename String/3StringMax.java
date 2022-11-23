class Solution {
    public String largestGoodInteger(String num) {
        String ans="";
        int max=0;
        for(int i=0;i<=num.length()-3;i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i+1)==num.charAt(i+2)){
                if(max<Math.max(max,num.charAt(i))){
                    max=Math.max(max,num.charAt(i));
                    ans=num.substring(i,i+3);
                }
            }
        }
        return ans;
    }
}