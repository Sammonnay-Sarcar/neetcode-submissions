class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        for(int shift = shifts.length - 1; shift>=0; shift--){
            i = (i+ shifts[shift])%26;
            int changed = s.charAt(shift) + i;
            char ch = (char) (changed>'z'? changed - 26:changed);
            sb.insert(0,ch);
        }
        return sb.toString();
    }
}
