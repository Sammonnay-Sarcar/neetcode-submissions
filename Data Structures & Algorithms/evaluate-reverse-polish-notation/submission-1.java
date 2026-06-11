class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> st = new Stack<>();
       for(int i = 0;i<tokens.length;i++){
            if(tokens[i].matches("-?\\d+")){
                st.push(Integer.parseInt(tokens[i]));
            }else{
                int m = st.pop();
                int n = st.pop();
                switch(tokens[i].charAt(0)){
                    case '+' -> st.push(n+m);
                    case '-' -> st.push(n-m);
                    case '*' -> st.push(n*m);
                    case '/' -> st.push(n/m);
                }
            }
       }
       return st.pop();
    }
}
