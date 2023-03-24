public class MakeParenthesisValid 
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || st.isEmpty()) st.push(ch);
            else{
                if(st.peek()=='('){
                    st.pop();
                } else st.push(ch);
            }
        }
        return st.size();
}

