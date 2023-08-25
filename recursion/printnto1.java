import java.util.*;

public class printnto1 {

    // public static void print(int n ){
    //     if(n == 0){
    //         return;
    //     }
    //     System.out.println(n);
    //     print(n-1);
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = n%2;
        System.out.println(ans);
    }
}
