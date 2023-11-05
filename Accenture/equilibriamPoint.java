public class equilibriamPoint{
    public static void main(String[] args) {
        int arr[] = {1,3,5,2,2};
        int n = arr.length;
        System.out.print(solve(arr,n));
    }
    public static int solve(int arr[] , int n){
        int  totalSum=0;
        for(long num:arr){
             totalSum+=num;
        }
         int leftSum=0;
         for(int i=0;i<n;i++){
             totalSum-=arr[i];
              if(leftSum==totalSum){
                return i+1;
              }
               leftSum += arr[i];
         }
        return -1;
        // System.out.println(leftSum + " " + rightSum + " " + arr[left+1]);
    }
}

// left sum = 1    1+3   4+5   9+2    11+2
//totalSum = 13-1  12-3  9-5ma