class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer, List<Integer>> hMap = new HashMap<>();
        for(int[] pair: adjacentPairs){
            hMap.computeIfAbsent(pair[0], k -> new ArrayList<>()).add(pair[1]);
            hMap.computeIfAbsent(pair[1], k -> new ArrayList<>()).add(pair[0]);
        }
        List<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer, List<Integer>> hMapEntry : hMap.entrySet()){
            if(hMapEntry.getValue().size() == 1){
                res.add(hMapEntry.getKey());
                res.add(hMapEntry.getValue().get(0));
                break;
            }
        }
        while(res.size() < adjacentPairs.length + 1){
            int last = res.get(res.size() - 1);
            int prev = res.get(res.size() - 2);
            List<Integer> candidates = hMap.get(last);
            int next = candidates.get(0) != prev? candidates.get(0):candidates.get(1);
            res.add(next);
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
