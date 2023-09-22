class Solution {
    public String convert(String s, int numRows) {
        int diff = (numRows *2) -2;
        int nextDiff = diff;
        int index, nextIndex;
        if(numRows == 1){
            return s;
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<numRows; i++){
            index = i;
            while(index< s.length()){
                ans.append(s.charAt(index));
                if(i != 0 && i != numRows -1){
                    nextDiff = diff - 2*i;
                    nextIndex = index + nextDiff;
                    if(nextIndex < s.length()){
                        ans.append(s.charAt(nextIndex));
                    }
                }
                index += diff;
            }
        }
        return ans.toString();
    }
}
