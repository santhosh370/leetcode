public class MinStack {
    Stack<Integer> stk;
    Stack<Integer> minStack;
    public MinStack() {
        stk=new Stack<>();
        minStack=new Stack<>();
    }
    
    public void push(int value) {
        stk.push(value);
        if(minStack.isEmpty()){
           minStack.push(value); 
        }else{
            if(value<=minStack.peek()){
                minStack.push(value);
            }
        }
    }
    
    public void pop() {
        if(!stk.isEmpty()){
            if(minStack.peek().equals(stk.peek())){
                stk.pop();
                minStack.pop();
            }else{
                stk.pop();
            }
        }
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}