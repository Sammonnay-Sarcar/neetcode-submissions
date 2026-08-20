class Solution {
    public int trap(int[] height) {
        int[] prefixArr = new int[height.length];
        int[] suffixArr = new int[height.length];
        int maxPrefix = height[0];
        for(int i=0; i<height.length;i++){
            if(height[i]>maxPrefix){
                maxPrefix = height[i];
            }
            prefixArr[i] = maxPrefix;
        }
        int maxSuffix = height[height.length -1];
        for(int i = height.length-1;i>=0;i--){
            if(height[i]>maxSuffix){
                maxSuffix = height[i];
            }
            suffixArr[i] = maxSuffix;
        }
        int result = 0;
        for(int i = 0;i<height.length;i++){
            result += Math.min(prefixArr[i],suffixArr[i]) - height[i];
        }
        return result;
    }
}
