class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String x : tokens){
            if("+-*/".indexOf(x)>=0){
                switch(x){
                    case "+" -> st.push(st.pop()+st.pop());
                    case "-" -> {
                        int a = st.pop();
                        int b = st.pop();
                        st.push(b-a);
                    }
                    case "*" -> st.push(st.pop()*st.pop());
                    case "/" ->{ 
                        int a = st.pop();
                        int b = st.pop();
                        st.push(b/a);
                    }
                }
            }else{
                st.push(Integer.parseInt(x));
            }
            
        }
        return st.pop();
    }
}
