class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[] time = new double[target+1];
        for(int i = 0; i<position.length;i++){
            time[position[i]] =(double) (target - position[i])/speed[i];
        }
        double min = 0.0;
        int count = 0;
        for(int i = time.length-1;i>=0;i--){
            if(time[i]!=0){
                if(time[i]>min){
                    count++;
                    min = time[i];
                }
            }
        }
        return count;
    }
}
