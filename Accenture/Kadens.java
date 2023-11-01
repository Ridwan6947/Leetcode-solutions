public class Kadens {
    public static void main(String[] args) {
        int arr[] = {1,2,3,-2,5};
        int ans = solve(arr);
        System.out.println(ans);
    }
    public static int solve(int arr[]){
        int currMax = arr[0];
        int max = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            currMax = Math.max(arr[i] , currMax + arr[i]);
            max = Math.max(currMax , max);
        }
        return max;
    }
}
