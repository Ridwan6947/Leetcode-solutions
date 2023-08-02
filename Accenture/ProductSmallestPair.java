import java.util.*;

public class ProductSmallestPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 4;
        // ArrayList<Integer> list = new ArrayList<>();
        int [] arr = {9,8,3,-7,3,9};
        Arrays.sort(arr);
        int ans = arr[0] + arr[1];
        if(ans <= sum){
            System.out.println(arr[0] * arr[1]);
        }
    }
}
