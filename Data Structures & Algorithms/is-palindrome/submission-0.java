class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^A-za-z0-9]+","");
        s=s.toLowerCase();
        for(int i = 0 ; i < s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1 -i)){
                return false;
            }
        }
        return true;
    }
}
