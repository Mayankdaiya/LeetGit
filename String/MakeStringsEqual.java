public class MakeStringsEqual {
    public int minSteps(String s, String t) {
        int ch1[]=new int[26];
        int ch2[]=new int[26];
        for(int i=0;i<s.length();i++){
            ch1[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            ch2[t.charAt(i)-'a']++;
        }
        int ans=0;
        for(int i=0;i<26;i++){
            ans+=Math.abs(ch1[i]-ch2[i]);
        }
        return ans;
    }
}