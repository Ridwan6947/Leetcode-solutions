class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i<n-1;i++){
            int s = i;
            for(int j =i+1 ; j<n ;j++ ){
                if(nums[s] > nums[j]){
                    s = j;
                }
            }
            int temp = nums[s];
            nums[s] = nums[i];
            nums[i] = temp;
        }
       
    
    }
}
