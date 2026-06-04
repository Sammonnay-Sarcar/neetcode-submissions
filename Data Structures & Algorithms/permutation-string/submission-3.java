class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Arr = new int[26];
        int[] s2Arr = new int[26];
        if(s1.length()>s2.length()){
            return  false;
        }
        for(int i =0;i<s1.length();i++){
            s1Arr[s1.charAt(i)-'a']++;       
        }
        for(int i =0;i<s1.length()-1;i++){
            s2Arr[s2.charAt(i)-'a']++;       
        }
        int l = 0;
        for(int r =s1.length()-1;r<s2.length();r++){   
            s2Arr[s2.charAt(r)-'a']++; 
            if(Arrays.toString(s1Arr).equals(Arrays.toString(s2Arr))){
                return true;
            }
            s2Arr[s2.charAt(l)-'a']--;
            l++;
        }
        return false;
    }
}
