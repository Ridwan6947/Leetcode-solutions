class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(ans,"",0,0,n);
        return ans;
    }
    public void helper(List<String> ans ,String temp , int open , int close , int max){
        if(temp.length() == max*2){
            ans.add(temp);
            return;
        }
        if(open < max){
            helper(ans,temp+"(" , open+1 , close , max);
        }
        if(close < open){
            helper(ans,temp+")",open,close+1,max);
        }
    }
}
