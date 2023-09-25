class Solution {
    public int lengthOfLongestSubstring(String s) {
        int arr[] = new int[128];
        int left = 0, n= s.length();
        int maxLength = 0;
        Arrays.fill(arr, -1);
        for(int right = 0; right<n;right++){
            if(arr[s.charAt(right)]>=left){
                left = arr[s.charAt(right)]+1;
            }
            arr[s.charAt(right)] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
