import java.util.*;

public class ibm5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 121;
        int rev = solve(n);
        boolean ans = check(n,rev);
        System.out.println(rev + " " + ans);
    }
    public static int solve(int n){
        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            ans = ans * 10 + rem;
            n = n / 10;
        }
        return ans;
    }
    public static boolean check(int n , int rev){
        return n == rev;
    }
}
