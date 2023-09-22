class Solution {
    public boolean isSubsequence(String s, String t) {
        int temp = 0;
        if(s.isEmpty()){
            return true;
        }
        for(int i=0; i<t.length(); i++){
            if(temp<=s.length() && (t.charAt(i) == s.charAt(temp))){
                if(temp== s.length()-1){
                    return true;
                }else{
                    temp++;
                }

            }
        }
        return false;
    }
}
//temp=0,1,2
