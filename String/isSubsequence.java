class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0;
        if(s.length()==j) return true;
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)==s.charAt(j)){
                j++;
            }
            if(s.length()==j) return true;
        }
        return false;
    }
}