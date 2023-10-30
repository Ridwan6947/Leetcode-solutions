class Solution {
    public static int missingNumber(int array[], int n) {
        int tot=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum+=array[i];
        }
        int res=tot-sum;
        return res;
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,5};
        int ans = missingNumber(arr, arr.length);
        System.out.println(ans);

    }
}
