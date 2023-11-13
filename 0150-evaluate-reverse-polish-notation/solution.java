class Solution {
    public int evalRPN(String[] tokens) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        for(String ch : tokens){
            if(!ch.equals("+") && !ch.equals("-") && !ch.equals("*") && !ch.equals("/")){
                stack.push(Integer.parseInt(ch));
            }else{
                int arg1 = stack.peek();
                stack.pop();
                int arg2 = stack.peek();
                stack.pop();
                switch(ch){
                    case "+":res=arg1+arg2;
                    break;
                    case "-":res=arg2-arg1;
                    break;
                    case "*":res=arg1*arg2;
                    break;
                    case "/":res=arg2/arg1;
                }
                stack.push(res);
            }
        }
        return(stack.peek());
    }
}
