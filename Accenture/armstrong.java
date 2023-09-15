import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 152;
        String str = Integer.toString(n);
        boolean ans = solve(n,str);
        System.out.println(ans);
    }
    public static boolean solve(int n , String str){
        int len = str.length();
        int temp = n;
        int p = 0;
        while(temp > 0){
            int digit = temp % 10;
            p = (int)(p + (Math.pow(digit, len)));
            temp = temp / 10;
        }
        return n == p;
    }
}
