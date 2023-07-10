class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer>st = new Stack<>();
        st.push(-1);
        int len = 0;

        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c == '('){
                st.push(i);
            }else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }else{
                    len = Math.max(len , i-st.peek());
                }
            }
        }
        return len;
    }
}
