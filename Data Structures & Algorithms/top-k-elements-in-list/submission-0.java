class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count = new HashMap<>();
        List<List<Integer>> bucket = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for(int i : nums){
            count.put(i,count.getOrDefault(i,0)+1);
        }
        for (int i = 0; i <= nums.length; i++) {
            bucket.add(new ArrayList<>());
        }
        for(Map.Entry<Integer,Integer> entry : count.entrySet()){
            bucket.get(entry.getValue()-1).add(entry.getKey());
        }
        int bucketPointer = bucket.size()-1;
        for(int i = 0;i<k && bucketPointer>=0;){
            List<Integer> temp = bucket.get(bucketPointer);
            if(temp.size()>=k-i){
                res.addAll(temp.subList(0,k-i));
                break;
            }else{
                res.addAll(temp);
                i += temp.size(); 
            }
            bucketPointer--;
        }
        int[] primitiveArray = res.stream()
                                   .mapToInt(Integer::intValue)
                                   .toArray();
                                   return primitiveArray;
    }
}
