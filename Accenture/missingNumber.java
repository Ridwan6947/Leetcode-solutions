class Solution {
    int missingNumber(int array[], int n) {
        int tot=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum+=array[i];
        }
        int res=tot-sum;
        return res;
    }
}
