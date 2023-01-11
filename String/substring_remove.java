class Solution {
    public String removeOccurrences(String s, String part) {
        return removeSubstring(s,part);
    }

    public static String removeSubstring(String s1,String s2){
        for(int i=0;i<=(s1.length()-s2.length());i++){
            String str=s1.substring(i);
            if(str.startsWith(s2)){
                s1=s1.substring(0,i)+s1.substring(i+s2.length());
                i=-1;
            }
        }  
        return s1;
    }
}