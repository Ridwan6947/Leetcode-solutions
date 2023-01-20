class Solution {
    public int maxSubArray(int[] nums) {
        int cmax = nums[0];
        int max = nums[0];

        for(int i = 1 ; i < nums.length ; i++){
            if(cmax<0){
                cmax = 0;
            }
            cmax += nums[i];
            if(max<cmax){
                max = cmax;
            }
        }
        return max;
        
        
    }
}
