class Solution {
    public List<Integer> majorityElement(int[] nums) {
         HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i]))
           map.put(nums[i],map.get(nums[i])+1);
        else
           map.put(nums[i],1);
    }
    List<Integer> li = new ArrayList<>();
        int n = nums.length/3;
        for(Map.Entry<Integer, Integer> entry: map.entrySet())
        if(entry.getValue()>n)
        li.add(entry.getKey());
        return li;
    }
}
