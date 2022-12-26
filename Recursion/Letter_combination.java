import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            ArrayList<String> l=new ArrayList<>();
            return l;
        } 
        ArrayList<String> list=getTheCombination(digits,"");
        return list;
    }
    static String keypads[]={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static ArrayList<String> getTheCombination(String str1,String str2){
        if(str1.isEmpty()){
            ArrayList<String> l=new ArrayList<>();
            l.add(str2);
            return l;
        }
        ArrayList<String> ans=new ArrayList<>();
        int digit=str1.charAt(0)-'0';
        String str=keypads[digit-2];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            ans.addAll(getTheCombination(str1.substring(1),str2+ch));
        }
        return ans;
    }
}