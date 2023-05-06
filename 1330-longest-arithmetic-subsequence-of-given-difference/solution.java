class Solution {
    public int longestSubsequence(int[] arr, int difference) {
       HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
       int max=1;
       for(int i=0;i< arr.length;i++){
           int temp = map.getOrDefault(arr[i]-difference, 0);
           map.put(arr[i], temp+1);
           max = Math.max(max,temp+1);
       }
       return(max);
    }
}
