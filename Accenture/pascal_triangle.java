class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> arr = null;
        for(int i = 0 ; i <= rowIndex ; i++){
            arr = new ArrayList<>();
            for(int j = 0 ; j <= i ; j++){
                if(j == 0 || j == i){
                    arr.add(1);
                }else{
                    arr.add(ans.get(j-1) + ans.get(j));
                }
            }
            ans = arr;
        }
        return ans;
    }
}