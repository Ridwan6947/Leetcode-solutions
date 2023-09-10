import java.util.*;
//LCM Code
public class ibm9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 15;
        int m = 20;
        int ans = solve(n,m);
        System.out.println(ans);
    }
    public static int solve(int n , int m){
        int min = Math.min(n,m);
        int max = Math.max(n,m);
        for(int i = max ;; i+=max){
            if(i % min == 0){
                return i;
            }
        }
    }
}
