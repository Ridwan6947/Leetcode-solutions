class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        int posi = 0;
        int neg = 0;
        while(i < n && s.charAt(i) == ' '){
            i++;
        }
        if(i < n && s.charAt(i) == '+'){
            posi++;
            i++;
        }

        if(i < n && s.charAt(i) == '-'){
            neg++;
            i++;
        }
        double ans = 0;
        while(i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            ans = ans * 10 + (s.charAt(i) - '0');
            i++;
        }
        if(neg > 0){
            ans = -ans;
        }
        if(posi > 0 && neg > 0){
            return 0;
        }
        if(ans > Integer.MAX_VALUE){
            return Integer.MAX_VALUE; 
        }
        if(ans < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int) ans;
    }
}
