class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int count = 0;
        double minTime = 0.0;
        int[] arr = new int[target+1];
        for(int i = 0; i<position.length;i++){
            arr[position[i]] = speed[i];
        }
        for(int i = arr.length -1; i>=0;i--){
            if(arr[i]!=0){
                double temp = (double)(target-i)/arr[i];
                if(temp>minTime){
                    count++;
                    minTime = temp;
                }
            }
        }
        return count;
    }
}
