// package sorting;

public class merge {
    public static void main(String[] args) {
        int[] arr = {7,8,1,3,2};
        int n = arr.length;

        divide(arr,0,n-1);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void divide(int[] arr , int si , int ei){

        if(si >= ei){
            return;
        }
        int mid = si + (ei - si) / 2;

        divide(arr, si, mid);
        divide(arr, mid+1, ei);

        conquer(arr,si,mid,ei);
    }
    public static void conquer(int[] arr , int si , int mid , int ei){
        int[] sorted = new int[ei-si+1];

        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;

        while(idx1 <= mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                sorted[x++] = arr[idx1++];
            }else{
                sorted[x++] = arr[idx2++];
            }
        }

        while(idx1 <= mid){
            sorted[x++] = arr[idx1++];
        }
        while(idx2 <= ei){
            sorted[x++] = arr[idx2++];
        }

        for(int i = 0 , j = si ; i< sorted.length ; i++ , j++){
            arr[j] = sorted[i];
        }
    }
}
