class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left =0, right = arr.length -1;
        int high = Integer.MIN_VALUE;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid+1] < arr[mid]){
                right = mid -1;
                high =mid;
            }else if(arr[mid+1] > arr[mid]){
                left = mid+1;
            }
        }
        return high;
    }
}
