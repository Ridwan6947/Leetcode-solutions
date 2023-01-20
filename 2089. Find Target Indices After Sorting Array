class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] == target){
                list.add(i);
            }
        }
        return list;
        
    }
}

_____________________________________________________________________________________
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        for(int i = 0 ; i < nums.length-1 ; i++){
            for(int j = 0 ; j <nums.length-1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }

        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
                list.add(i);
            
        }
        return list;
        
    }
}
