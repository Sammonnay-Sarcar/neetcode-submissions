class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String, List<String>> map = new HashMap<>();
       for(String wrd:strs){
           char[] wrdArr = wrd.toCharArray();
           Arrays.sort(wrdArr);
           String sortedWrd = new String(wrdArr);
            if (!map.containsKey(sortedWrd)) {
                map.put(sortedWrd, new ArrayList<>());
            }
            
            map.get(sortedWrd).add(wrd);
       }
       return new ArrayList<>(map.values());
    }
}
