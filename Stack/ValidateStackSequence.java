import java.util.Stack;

public class ValidateStackSequence {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<>();
        int i=0, in=0;
        while(in<popped.length && i<pushed.length){
            while(i<pushed.length){
                st.push(pushed[i]);
                if(pushed[i]==popped[in]){
                    i++;
                    break;
                }
                i++;
            }
            while(!st.isEmpty()){
                if(st.peek()==popped[in]){
                    st.pop();
                    in++;
                }
                else break;
            }
        }
        return st.isEmpty();
    }
}