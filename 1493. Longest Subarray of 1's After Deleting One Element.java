class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int zero = -1;
        int n = nums.length;
        for(int right = 0 , left = 0 ; right < n ; right++){
            System.out.println("left :" + left);
            if(nums[right] == 0){
                left = zero+1;   
                System.out.println("left :" + left);
                zero = right;       
                System.out.println("zero :" + zero);     
            }
            System.out.println("right :" + right);
            max = Math.max(max, right-left);
        }
        return max;
    }
}
