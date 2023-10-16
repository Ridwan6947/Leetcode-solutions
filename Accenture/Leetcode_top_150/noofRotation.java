import java.util.*;
public class noofRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {15, 18, 2, 3, 6, 12};
        int ans = solve(arr);
        System.out.println(ans);
    }
    public static int solve(int[] arr) {
        int count = 0;
        int temp[] = arr.clone();
        Arrays.sort(temp);
        int k = 1;
        System.out.println(arr.length-k-1);
        while(!Arrays.equals(arr, temp)){
            reverse(arr,0,arr.length-k-1);
            reverse(arr,arr.length-k,arr.length-1);
            reverse(arr,0,arr.length-1);
            count++;
        }
        return count;
    }
    public static void reverse(int[] arr, int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}


