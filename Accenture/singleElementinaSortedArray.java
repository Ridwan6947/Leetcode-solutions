import java.util.*;

public class singleElementinaSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4};
        int ans = solveUsingBinary(arr);
        int ans1 = solveUsinghash(arr);
        System.out.println(ans + " " + ans1);
    }
    public static int solveUsingBinary(int[] arr){
        int l = 0;
        int r = arr.length-1;
        while(l < r){
            int mid = (l+r)/2;
            if(mid % 2 == 0 && arr[mid] == arr[mid+1] || mid % 2 == 1 && arr[mid] == arr[mid-1]){
                l = mid+1;
            }else{
                r = mid - 1;
            }
        }
        return arr[l];
    }
    public static int solveUsinghash(int[] arr){
        // int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i , map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        int ans = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                ans = entry.getKey();
            }
        }
        return ans;
    }
}
