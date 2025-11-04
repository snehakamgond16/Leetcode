class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray=new int[nums1.length + nums2.length];
        int k=0;
        for(int i=0; i<nums1.length; i++){
            mergedArray[k++]=nums1[i];
        }
        for(int j=0; j<nums2.length; j++){
            mergedArray[k++]=nums2[j];
        }
        Arrays.sort(mergedArray);
        int n=mergedArray.length;
        if(n%2==0){
            return (mergedArray[n/2-1] + mergedArray[n/2])/2.0;
        }else{
            return (mergedArray[n/2]);
        }
    }
}           