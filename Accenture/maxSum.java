import java.util.*;

public class maxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int []arr = {2,-3,4,6,1};
        // for(int i = 0 ; i < arr.length ; i++){
        //     arr[i] = sc.nextInt();
        // }
        int k = 2;
        int ans = solve(arr,k);
        System.out.println(ans);
    }
    public static int solve(int[] arr , int k){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            int j = i;
            int currMax = 0;
            while(j < arr.length){
                // System.out.println(arr[i]);
                currMax += arr[j];
                j +=k;
            }
            System.out.print(max + " " );
            max = Math.max(max,currMax);
        }
        return max;
    }
}
