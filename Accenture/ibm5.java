import java.util.*;

public class ibm5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 121;
        // int rev = solve(n);
        boolean ans = check(n);
        System.out.println(ans);
    }
    public static boolean check(int n){
        int temp = n;
        int rev = 0;
        while(n > 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return  temp == rev;

    }
}
