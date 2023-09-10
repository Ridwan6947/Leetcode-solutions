import java.util.*;

public class ibm8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3854;
        int ans = solve(n);
        System.out.println(ans);
    }
    // public static int solve(int n){
    //     int ans = 0;
    //     while(n > 0){
    //         int digit = n % 10;
    //         ans += digit;
    //         n = n / 10;
    //     }
    //     return ans;
    // }
    public static int solve(int n){
        String str = Integer.toString(n);
        int ans = 0;
        for(int i = 0; i < str.length() ; i++ ){
            ans += str.charAt(i) - '0';
        }
        return ans;
    }
}
