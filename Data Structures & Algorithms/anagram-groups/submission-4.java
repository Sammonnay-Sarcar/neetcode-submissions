class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for(String s : strs){
            int[] count = new int[26];
            for(char ch : s.toCharArray()){
                count[ch - 'a']++;
            }
            res.putIfAbsent(Arrays.toString(count), new ArrayList<>());
            res.get(Arrays.toString(count)).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
