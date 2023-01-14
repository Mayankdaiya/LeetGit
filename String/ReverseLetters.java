public class Solution {
    public String reverseOnlyLetters(String s) {
        int c=0, st=0, in=s.length()-1;
        for(int i=0;i<s.length();i++){
            while(in>=0 && !(s.charAt(in)>='a' && s.charAt(in)<='z') && !(s.charAt(in)>='A' && s.charAt(in)<='Z')){
                in--;
            }
            if(in<=i) break;
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z')){
                char ch1=s.charAt(i);
                char ch2=s.charAt(in);
                s=s.substring(0,i)+ch2+s.substring(i+1,in)+ch1+s.substring(in+1);
            }
            else{
                continue;
            }
            in--;
        }
        return s;
    }
} 
