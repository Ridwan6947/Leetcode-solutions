import java.util.*;

public class ibm4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 8;
        solve(n);
    }
    public static void solve(int n){
        int i = 0;
        int [] arr = new int[1000];
        while(n > 0){
            arr[i] = n % 2;
            n = n /2;
            i++;

        }
        for(int j = i -1 ; j>=0 ; j--){
            System.out.print(arr[j]);
        }
    }
}
