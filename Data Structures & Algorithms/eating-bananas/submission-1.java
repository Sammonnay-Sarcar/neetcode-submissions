class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int max = piles[piles.length-1];
        int min = 1;
        int res = Integer.MAX_VALUE;
        while(min<=max){
            int mid = min + (max - min)/2;
            long sum =0;
            for(int i = 0; i<piles.length;i++){
                sum +=(long) Math.ceil((double) piles[i]/mid);
            }
            if(sum>h){
                min = mid +1;
            }else{
                res = mid;
                max = mid -1;
            }
        }
        return res;
    }
}
