import java.util.*;

public class q2 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4};
        int [] arr2 = {1,2,3,4,6};
        int a1 = solve(arr1);
        int a2 = solve(arr2);
        System.out.println(a1 + " " + a2);
    }
    public static int solve(int [] arr){
        int ans = 0;
        for(int i = 0 ; i < arr.length ; i+=2){
            ans += arr[i];
        }
        return ans;
    }
}
