class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int[] s1arr = new int[26];
       int[] s2arr = new int[26];
       Arrays.fill(s1arr, 0);
       Arrays.fill(s2arr, 0);
       int i = 0, freq = 0;
       int n1 = s1.length();
       int n2 = s2.length();
       while(i+n1<=n2){
        String s3 = s2.substring(i,i+n1);
        for(int j = 0;j<n1;j++){
            s1arr[s1.charAt(j)-'a']++;
            s2arr[s3.charAt(j)-'a']++;
        }
        for(int j = 0; j<26;j++){
            if(s1arr[j] == s2arr[j]){
                freq++;
            }
        }
        if(freq == 26){
            return true;
        }
        i++;
        Arrays.fill(s1arr, 0);
        Arrays.fill(s2arr, 0);
        freq=0;
       }
       return false;
    }
}
