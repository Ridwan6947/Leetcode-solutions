import java.util.*;

public class ibm14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1021;
        System.out.println(check(n));
    }    
    public static boolean check(int n){
        int temp = n;
        int rev = 0;
        while(n > 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        System.out.println(rev);
        if(rev == temp){
            return true;
        }
        return false;
    }
}
