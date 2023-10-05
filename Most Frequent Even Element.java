class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxCount = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] % 2 == 0){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                if(map.get(nums[i]) > maxCount){
                    maxCount = map.get(nums[i]);
                }
            }
        }
        int element = Integer.MAX_VALUE;
        for(int key : map.keySet()){
            if(map.get(key) == maxCount){
                element = Math.min(element,key);
            }
        }
        if(element == Integer.MAX_VALUE){
            return -1;
        }
        return element;
    }
}