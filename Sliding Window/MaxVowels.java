public class MaxVowels {
    public static boolean isVowel(char a){
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u') return true;
        return false;
    }
    public int maxVowels(String s, int k) {
        int count=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))) count++;
        }
        int curr=count;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i-k))) curr--;
            if(isVowel(s.charAt(i))) curr++;
            count=Math.max(curr,count); 
        }
        return count;
    }
}