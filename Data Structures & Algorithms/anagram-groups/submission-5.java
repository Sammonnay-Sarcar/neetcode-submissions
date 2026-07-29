class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hMap = new HashMap<>();
        for(String s : strs){
            int[] arr = new int[26];
            for(char ch : s.toCharArray()){
                arr[ch - 'a']++;
            }
            String x = Arrays.toString(arr);
            hMap.putIfAbsent(x, new ArrayList<>());
            hMap.get(x).add(s);
        }
        return new ArrayList(hMap.values());
    }
}
