import java.util.Arrays;

class Solution {
    public int partitionString(String s) {
        int arr[]=new int[26];
        int c=0;
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']==1){
                c++;
                Arrays.fill(arr,0);
                arr[s.charAt(i)-'a']++;
            }
            else arr[s.charAt(i)-'a']++;
        }
        return c+1;
    }
}