import java.util.*;

public class missingAndDuplicate {
    public static void main(String[] args){
        int arr[] = {1,2,2,4,4,4,5};
        int n = arr.length;
        int[] ans = solve(arr,n);
        System.out.println(ans);
    }
    public static int[] solve(int arr[] , int n){
        int ans[] = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getKey();
            }
        }
        boolean[] present = new boolean[n+1];
        for(int i : arr){
            if(i > 0 && i <= n){
                present[i] = true;
            }
        }
        int smallest = 0;
        for(int i = 1 ; i < present.length ; i++){
            if(!present[i]){
                smallest = i;
            }
        }
        ans[0] = max;
        ans[1] = smallest;
        return ans;
    }

}
