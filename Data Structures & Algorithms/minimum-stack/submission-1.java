class MinStack {
    Stack<Long> stack;
    long min; 
    public MinStack() {
        this.stack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(0L);
            min = val;
        }else{
            stack.push(val-min);
            if(val<min){
                min = val;
            }
        }
    }
    
    public void pop() { 
        if(stack.isEmpty()){
            return ;
        }else{
            long pop = stack.pop();
            if(pop<0){
                min = min - pop;
            }
        }
    }
    
    public int top() {
        if(stack.peek()>0)
            return (int) (min+stack.peek());
        else
            return (int)min;    
    }
    
    public int getMin() {
        return (int)min;
    }
}
