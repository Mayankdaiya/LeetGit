class Solution {
    public String smallestNumber(String pattern) {
        Stack<Integer> st=new Stack<>();
        Character ans[]=new Character[pattern.length()+1];
        char count='1';
        for(int i=0;i<pattern.length();i++){
            if(pattern.charAt(i)=='I'){
                ans[i]=count++;
                while(!st.isEmpty()) ans[st.pop()]=count++;
            }
            else st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()+1]=count;
            count++;
        }
        String res="";
        for(int i=0;i<ans.length;i++){
            if(ans[i]==null) res+=count;
            else res+=ans[i];
        } 
        return res;
    }
}