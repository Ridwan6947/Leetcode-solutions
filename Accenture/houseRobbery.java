class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        int prev2 = nums[0];
        int prev1 = Math.max(nums[0],nums[1]);
        int curr = prev1;

        for(int i = 2 ; i < n ;i++){
            curr = Math.max(prev2 + nums[i] , prev1);
            prev2 = prev1;
            prev1 = curr;

        }  
        return curr;
    }
}