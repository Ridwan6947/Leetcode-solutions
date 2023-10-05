class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int n = nums.length;
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > n/3){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}