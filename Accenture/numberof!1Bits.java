public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        // System.out.print(n);
        String str = Integer.toBinaryString(n);
        System.out.print(str);
        int ans = 0;
        for(int i = 0 ; i <  str.length() ; i++){
            char c = str.charAt(i);
            if(c == '1'){
                ans++;
            }
        }
        return ans;
    }
}