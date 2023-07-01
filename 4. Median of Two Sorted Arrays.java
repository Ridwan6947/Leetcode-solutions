class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int size = nums1.length + nums2.length;
       int []a1 = new int[size];
       int c = 0;
       for(int i = 0; i<nums1.length ; i++){
           a1[c]=nums1[i];
           c++;
       }
       for(int j = 0; j<nums2.length ; j++){
           a1[c] = nums2[j];
           c++;
       }
       Arrays.sort(a1);
       int n = a1.length;
       if (n % 2 != 0)
            return (double)a1[n / 2];
 
        return (double)(a1[(n - 1) / 2] + a1[n / 2]) / 2.0;
    }
}
