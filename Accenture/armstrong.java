import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 153;
        boolean res = solve(n);
        System.out.println(res);
    }
    public static boolean solve(int n ){
        int p = 0;
        int temp = n;
        while(n > 0){
            int rem = n % 10;
            p =  (p) + (rem * rem * rem);
            n = n/ 10;
        }
        return temp == p;
    }
}
