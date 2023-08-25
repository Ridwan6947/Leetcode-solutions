import java.util.*;

public class firstoccurance {

    public static int find(int arr[] , int target,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }
        return find(arr , target,i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ;i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target :");
        int target = sc.nextInt();
        int ans = find(arr,target,1);
        System.out.println(ans);
    }
}
