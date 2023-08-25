import java.util.*;

public class minCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a1 = new int[n];
        int [] a2 = new int[n];
        for(int i = 0 ; i < a1.length ; i++){
            a1[i] = sc.nextInt();
        }
        for(int i = 0 ; i < a2.length ; i++){
            a2[i] = sc.nextInt();
        }
        int result = solve(a1,a2,n);
        System.out.println(result);
    }
    public static int solve(int [] a1 , int [] a2 , int n){
        int ans = 0;
        int minFuel = a1[0];
        for(int i = 0 ; i < n ; i++){
            minFuel = Math.min(minFuel, a1[i]);
            ans += minFuel * a2[i];
        }
        return ans;
    }
}
