class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[temperatures.length];
        int max = temperatures[0];
        int left = 0;
        for(int right = 0; right<temperatures.length;right++){
            while(!st.isEmpty() && temperatures[st.peek()]<temperatures[right]){
                res[st.peek()] = right - st.peek();
                st.pop();
            }
            st.push(right);
        }
        return res;
    }
}
