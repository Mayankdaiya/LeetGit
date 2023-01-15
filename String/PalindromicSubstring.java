public class Solution {
    public int countSubstrings(String s) {
        int ans = 0;
        for(int i = 0; i < s.length() ; i++){
            int left = i;
            int right = i;
            while(left >= 0 && right < s.length()){
                if(s.charAt(left) == s.charAt(right)){
                    left--;
                    right++;
                    ans++;
                }
                else{
                    break;
                }
            }
            left = i;
            right = i + 1;;
            while(left >= 0 && right < s.length()){
                if(s.charAt(left) == s.charAt(right)){
                    left--;
                    right++;
                    ans++;
                }
                else{
                    break;
                }
            }
        }
        return ans;
    }
}
