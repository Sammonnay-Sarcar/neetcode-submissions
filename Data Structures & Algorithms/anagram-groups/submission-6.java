class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> result = new HashMap<>();
        for(String s:strs){
            int[] temp = new int[26];
            for(char ch : s.toCharArray())
            temp[ch - 'a']++;
            result.putIfAbsent(Arrays.toString(temp),new ArrayList<>());
            result.get(Arrays.toString(temp)).add(s);
        }
        return new ArrayList(result.values());
    }
}
