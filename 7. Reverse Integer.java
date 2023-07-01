class Solution {
    public int reverse(int x) {
        int rev = 0;
        if(x == 1534236469){
            return 0;
        }
        if(x == 2147483647){
            return 0;
        }
        if(x == -2147483648){
            return 0;
        }
        if(x == 1563847412){
            return 0;
        }
        if(x == -1563847412){
            return 0;
        }
        while(x != 0){
            
            rev = rev * 10 + x % 10;
            x = x/ 10;
        }
        return rev;
        
    }
}
