import java.util.*;

public class fibo {

    public static int print(int n ){
        if(n == 0 || n ==1){
            return n;
        }
        int f1 = print(n-1);
        int f2 = print(n-2);
        int ans = f1 + f2;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(print(n));
    }
}
