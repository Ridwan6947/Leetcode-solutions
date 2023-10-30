import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int []a=new int[n];
        Arrays.fill(a,0);
        for(int i=0;i<n;i++){
          a[arr[i]]=a[arr[i]]+1;
        }
        for(int i = 0; i < n; i++) {
            if(a[i] > 1) {
               res.add(i); 
            }
        }
        if(res.size()==0){
            res.add(-1);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,4,5,6,7,8,9,9,0};
        int n = arr.length;
        List<Integer> ans = duplicates(arr, n);
        System.out.println(ans);
    }
}
