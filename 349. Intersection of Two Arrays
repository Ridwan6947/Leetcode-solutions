class Solution {
    public int[] intersection(int nums1 [] , int nums2[]) {
    HashSet<Integer> set1 = new HashSet<>();
    HashSet<Integer> inter = new HashSet<>();

    for(Integer i : nums1){
        set1.add(i);
    }
    for(Integer i : nums2){
        if(set1.contains(i)){
            inter.add(i);
        }
    }
    int  size = inter.size();
    int []ans = new int[size];
    int index = 0;

    for(int i : inter){
        ans[index++] = i;
    }
    return ans;
}
}
