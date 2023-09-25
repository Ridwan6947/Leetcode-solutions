import java.util.*;

public class DXC9 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,0,5,6};
        int n = arr.length;
        int ans = helper(arr,n);
        System.out.println(ans);
    }
    public static int helper(int[] arr , int n){
        int ans = 0;
        int expectedSum = n * (n+1)/2;
        int totalSum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            totalSum += arr[i];
        }
        ans = expectedSum - totalSum;
        return ans;
    }
}
