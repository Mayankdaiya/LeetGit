class Solution {
    public String longestPalindrome(String s) {
        int ans = 0;
        int l = 0;
        int r = 0;
        for(int i = 0; i < s.length() ; i++){
            int left = i;
            int right = i;
            while(left >= 0 && right < s.length()){
                if(s.charAt(left) == s.charAt(right)){
                    if(ans < right - left + 1){
                        l = left;
                        r = right;
                        ans = right - left + 1;
                    }
                    left--;
                    right++;
                }
                else{
                    break;
                }
            }
            left = i;
            right = i + 1;;
            while(left >= 0 && right < s.length()){
                if(s.charAt(left) == s.charAt(right)){
                    if(ans < right - left + 1){
                        l = left;
                        r = right;
                        ans = right - left + 1;
                    }
                    left--;
                    right++;
                }
                else{
                    break;
                }
            }
        }
        // System.out.println(ans);
        return s.substring(l,r + 1);
    }
}