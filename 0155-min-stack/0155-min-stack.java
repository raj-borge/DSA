class MinStack {
    private Stack<Long> st;
    private long min;

    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int value) {
        long val=value;
        if(st.isEmpty()){
            min=val;
            st.push(val);
        }
        else{
            if(val>=min) st.push(val);
            else{
                long newVal=2*val-min;
                st.push(newVal);
                min=val;
            }
        }
    }
    
    public void pop() {
        long x=st.peek();
        st.pop();
        if(x<min){
            min=2*min-x;
        }
    }
    
    public int top() {
        long x=st.peek();
        if(min<x) return (int)x;
        return (int)min;
    }
    
    public int getMin() {
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */