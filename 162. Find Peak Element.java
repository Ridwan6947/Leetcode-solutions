class Solution {
    public int findPeakElement(int[] nums) {
        int idx = nums.length-1;
        for(int i = 0 ; i < nums.length -1; i++){
            if(nums[i] > nums[i+1]){
                idx = i;
                break;
            }
        }
        return idx;
    }
}
