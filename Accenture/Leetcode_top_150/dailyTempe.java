import java.util.Stack;

public class dailyTempe {
    public static void main(String[] args) {
        int [] arr = {73,74,75,71,69,72,76,73};
        int [] ans = dailyTemp(arr);
        System.out.println(ans);
    }
    public static int[] dailyTemp(int[] temp) {
        int ans[] = new int[temp.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < temp.length ; i++){
            while(!st.isEmpty() && temp[i] > temp[st.peek()]){
                int idx = st.pop();
                ans[idx] = i - idx;
            }
            st.push(i);
        }
        return ans;
}
