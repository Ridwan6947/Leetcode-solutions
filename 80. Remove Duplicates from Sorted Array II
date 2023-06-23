class Solution {
    public int removeDuplicates(int[] nums) {
        TreeMap<Integer , Integer> map = new TreeMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        int k = 0;
        int index = 0;
        for(int num : map.keySet()){
            for(int i =0 ; i < Math.min(map.get(num),2) ; i++){
                nums[index++]=num;
            }
        }
        return index;
    }
}
