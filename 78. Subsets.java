class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>result = new ArrayList<>();
        sub(0,nums,new ArrayList<>(),result);
        return result;
    }
    public void sub(int i , int []nums , List<Integer>subset ,  List<List<Integer>>result){
        if(i >= nums.length ){
            result.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        sub(i+1,nums,subset,result);
        subset.remove(subset.size() - 1);
        sub(i+1,nums,subset,result);
    }
}
