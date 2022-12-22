import java.util.Stack;

class MinStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> min=new Stack<>();
    public MinStack() {

    }
    
    public void push(int val) {
        st.push(val);
        if(min.isEmpty()) min.push(val);
        else{
            if(st.peek()<=min.peek()) min.push(st.peek());
        }
    }
    
    public void pop() {
        if(st.peek()==min.peek()) min.pop();
        st.pop();
        if(st.isEmpty()) min.pop();
    }
    
    public int top() {
       return st.peek();
    }
    
    public int getMin() {
        
        return min.peek();
    }
}
