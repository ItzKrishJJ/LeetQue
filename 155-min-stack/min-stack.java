class pair{
    int first;
    int second;
    pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
class MinStack {
    Stack<pair> st;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty())
        {
            st.push(new pair(val,val));
        }
        else{
            st.push(new pair(val, Math.min(st.peek().second,val)));
        }
    }
    
    public void pop() {
        if(!st.isEmpty())
        {
            st.pop();
        }
    }
    
    public int top() {
        return st.peek().first;
    }
    
    public int getMin() {
        return st.peek().second;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */