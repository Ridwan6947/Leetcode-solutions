class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0; 
        int right = nums.length-1;
        int count = 0;
        while(left < right){
            int mid = nums[left] + nums[right];
            if(mid == k){
                left++;
                right--;
                count++;
            }else if(mid<k){
                left++;
            }else
                right--;
        }
        return count;
    }
}
