import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1634;
        String str = Integer.toString(n);
        int len = str.length();
        boolean res = solve(n,len);
        System.out.println(res);
    }
    public static boolean solve(int n , int len ){
        int p = 0;
        int temp = n;
        while(n > 0){
            int rem = n % 10;
            p =  (int) ((p) + (Math.pow(rem , len)));
            n = n/ 10;
        }
        return temp == p;
    }
}
