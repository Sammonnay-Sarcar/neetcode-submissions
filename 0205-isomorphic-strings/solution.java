class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        int m = s.length();
        if(n!=m)
        return false;
        int[] s1 = new int[200];
        int[] s2 = new int[200];
        for(int i = 0;i<n;i++){
            if(s1[s.charAt(i)] != s2[t.charAt(i)])
            return false;
            s1[s.charAt(i)] = i+1;
            s2[t.charAt(i)] = i+1;
        }
        return true;
    }
}
