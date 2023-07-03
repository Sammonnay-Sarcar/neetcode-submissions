class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j=n-1;
        int k = nums1.length;
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k-1]=nums1[i];
                k--;
                i--;
            }else if(i>=0 && nums1[i]==nums2[j]){
                nums1[k-1] = nums1[i];
                nums1[k-2] = nums2[j];
                i--;
                j--;
                k -=2;
            }else{
                nums1[k-1] = nums2[j];
                k--;
                j--;
            }
        }
    }
}
