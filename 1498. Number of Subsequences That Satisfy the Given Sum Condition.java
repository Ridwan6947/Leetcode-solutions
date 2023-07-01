class Solution {
    public int numSubseq(int[] nums, int target) {
        // for(int i = 0 ; i < nums.length ;i++){
        //     for(int j = 1 ; j < nums.length-1 ; j++){
        //         if(i > j){
        //             int temp = i; 
        //             i = j;
        //             j = temp;
        //         }
        //     }
        // }
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        int res = 0;
        int n = nums.length;
        int mod = (int)1e9 + 7;
        int[] pows = new int[n];
        pows[0] = 1;
        for (int i = 1 ; i < n ; ++i)
            pows[i] = pows[i - 1] * 2 % mod;
        while (left <= right) {
            if (nums[left] + nums[right] > target) {
                right--;
            } else {
                res = (res + pows[right - left++]) % mod;
            }
        }
        return res;
    }
}
