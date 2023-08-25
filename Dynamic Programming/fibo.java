import java.util.*;

//recursion

// public class fibo{
//     public static int fib(int n){
//         if(n == 0 || n == 1){
//             return n;
//         }
//         return fib(n-1) + fib(n-2);
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(fib(n));
//     }
// }

public class fibo{
    public static int fib(int n , int []f){
        if(n == 0 || n == 1){
            return n;
        }
        if(f[n] != 0){
            return f[n];
        }
        f[n] = fib(n-1, f) + fib(n-2, f);
        return f[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int [] f = new int [n+1];
        System.out.println(fib(n,f));
    }
}