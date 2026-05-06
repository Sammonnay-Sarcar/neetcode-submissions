class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[n*2];
        int xP = 0;
        int yP = n;
        for(int i = 0;i<n*2;i=i+2){
            res[i]=nums[xP];
            xP++;
            res[i+1]=nums[yP];
            yP++;
        }
        return res;
    }
}
