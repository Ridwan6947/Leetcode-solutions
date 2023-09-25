import java.util.*;

public class DXC7 {
    public static void main(String[] args) {
        int itemPrice = 84302;
        int ans = solve(itemPrice);
        System.out.println(ans);
    }
    public static int solve(int itemPrice){
        int ans = 0;
        while(itemPrice > 0){
            int digit = itemPrice % 10;
            if(isPrime(digit)){
                ans += digit;
            }
            itemPrice = itemPrice / 10;
        }
        return ans;
    }
    public static boolean isPrime(int digit){
        if( digit <= 1) return false;
        // if(digit == 2) return true;
        for(int i = 2 ; i < digit ; i++){
            if(digit % i == 0){
                return false;
            }
        }
        return true;
    }
}
