import java.util.Stack;

public class BaseBallGame {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int x=st.pop();
                int y=st.peek()+x;
                st.push(x);
                st.push(y);
            } else if(operations[i].equals("C")){
                st.pop();
            } else if(operations[i].equals("D")){
                st.push(2*st.peek());
            } else{
                int x=Integer.parseInt(operations[i]);
                st.push(x);
            }
        }
        int record=0;
        while(!st.isEmpty()) record+=st.pop();
        return record;
    }
}