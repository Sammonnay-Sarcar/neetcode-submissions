class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> scoreStack = new Stack<>();
        int score = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                scoreStack.push(score);
                score = 0;
            }else{
                score = scoreStack.pop() + Math.max(2*score, 1);
            }
        }
        return score;
    }
}

//( -> 0
//) -> 0+1 = 1
//( ->  
//) -> 
