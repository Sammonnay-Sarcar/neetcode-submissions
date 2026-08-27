class Solution {
    public String minWindow(String s, String t) {
       HashMap<Character,Integer> countT = new HashMap<>();
       for(char ch:t.toCharArray()){
            countT.put(ch,countT.getOrDefault(ch, 0)+1);
       }
       int have = 0, need = countT.size();
       HashMap<Character,Integer> window = new HashMap<>();
       int[] res = new int[]{-1,-1};
       int resLen = Integer.MAX_VALUE;
       int left = 0;
       for(int right = 0;right<s.length();right++){
            window.put(s.charAt(right),
                        window.getOrDefault(s.charAt(right),0)+1);
            if(countT.containsKey(s.charAt(right))&&countT.get(s.charAt(right)).equals(window.get(s.charAt(right)))){
                    have++;
                }
            while(have==need){
                if(right-left+1<resLen){
                    res[0] = left;
                    res[1] = right;
                    resLen = right - left + 1;
                }
                window.put(s.charAt(left),window.get(s.charAt(left))-1);
                if(countT.containsKey(s.charAt(left)) && window.get(s.charAt(left))<countT.get(s.charAt(left))){
                    have--;
                }
                left++;
            }    
       }
       return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }
}
