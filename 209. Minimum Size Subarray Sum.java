class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0; 
        int j = 0;
        int sum = 0;
        int len = Integer.MAX_VALUE ;

        while(j < nums.length){
            sum += nums[j];
            while(sum>=target){
                sum = sum - nums[i];
                len = Math.min(j-i+1 , len);
                System.out.println(len);
                i++;
            }
            j++;
        }
        if(len ==Integer.MAX_VALUE){
            return 0;
        }
        return len;
        
    }
}
