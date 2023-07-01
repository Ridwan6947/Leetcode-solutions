class Solution {
    public int maxProfit(int[] nums) {
        int sell = 0;
        int min = Integer.MAX_VALUE;
        for(int i : nums){
            if(i < min){
                min = i;
            }
            sell = Math.max(sell , i - min);
        }
        return sell;
        
    }
}
