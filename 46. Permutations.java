class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        findPer(nums,new ArrayList<>() , result);
        return result;
    }
    public static void findPer(int nums[] , List<Integer> temp , List<List<Integer>> result){
        if(temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            findPer(nums,temp,result);
            temp.remove(temp.size()-1);
        }
    }
}
