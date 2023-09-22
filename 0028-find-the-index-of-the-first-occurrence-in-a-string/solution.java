class Solution {
    public int strStr(String haystack, String needle) {
        StringBuilder ans = new StringBuilder();
        int nIndex = 0;
        if(haystack.length()<needle.length()){
            return -1;
        }
        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            nIndex = 0;
            while(nIndex<needle.length() && haystack.charAt(i+nIndex) == needle.charAt(nIndex) ){
                    nIndex++;
            }
            if(nIndex == needle.length()){
                    return i;
                }
        }
        return -1;
    }
}
