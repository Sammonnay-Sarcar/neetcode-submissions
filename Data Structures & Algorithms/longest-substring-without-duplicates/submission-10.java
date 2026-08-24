class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max = 0;
        if(s.trim().length() <=1){
            return s.length()>0?1:0;
        }
        HashSet<Character> rSet = new HashSet<>();
        for(int right = 0; right < s.length(); right++){
            while(rSet.contains(s.charAt(right))){
                rSet.remove(s.charAt(left));
                left++;                
            }
            rSet.add(s.charAt(right));
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}
