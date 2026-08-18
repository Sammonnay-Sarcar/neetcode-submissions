class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        List<List<Integer>> bucket = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for(int i:nums){
            hMap.putIfAbsent(i,0);
            hMap.put(i,hMap.get(i)+1);
        }
        for(int i = 0; i<nums.length;i++){
            bucket.add(new ArrayList<>());
        }
        for(HashMap.Entry<Integer,Integer> entry : hMap.entrySet()){
            bucket.get(entry.getValue()-1).add(entry.getKey());
        }
        int bucketPointer = nums.length-1;
        while(k>0 && bucketPointer>=0){
            if(bucket.get(bucketPointer).size()>0){
                for(Integer i : bucket.get(bucketPointer)){
                    res.add(i);
                    k--;
                    if(k==0)
                        break;
                }
            }
            bucketPointer--;
        }
        return res.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
    }
}
