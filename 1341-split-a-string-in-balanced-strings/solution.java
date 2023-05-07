class Solution {
    public int balancedStringSplit(String s) {
       int answer = 0,balance=0;
       for(int i = 0;i<s.length();i++){
           if(s.charAt(i)=='L'){
               balance++;
               if(balance==0){
                   answer++;
                   balance=0;
               }
           }
           if(s.charAt(i)=='R'){
               balance--;
               if(balance==0){
                   answer++;
                   balance=0;
               }
           }
       }
       return(answer);
    }
}
