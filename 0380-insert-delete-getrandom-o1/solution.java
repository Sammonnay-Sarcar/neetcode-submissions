class RandomizedSet {
    Set<Integer> testSet = new HashSet<Integer>();
    public RandomizedSet() {
        // RandomizedSet obj = new RandomizedSet();
        // boolean ins = obj.insert(val);
        // boolean rmv = obj.remove(val);
        // int rand = obj.getRandom();
    }
    
    public boolean insert(int val) {
        if(testSet.contains(val)){
            return false;
        }
        testSet.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(testSet.contains(val)){
            testSet.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        List<Integer> list = new ArrayList<Integer>(testSet);
       int r=(int)(Math.random()*testSet.size());
        
       return list.get(r);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */

