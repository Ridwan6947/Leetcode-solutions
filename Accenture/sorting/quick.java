// package sorting;

public class quick {
    public static void main(String[] args) {
        int arr[] = {7,8,1,3,2};
        int n = arr.length;

        quicksort(arr,0,n-1);
        for(int i = 0 ; i < arr.length ; i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
    }
    public static void quicksort(int arr[] , int low , int high){
        if(low < high){
            int pvix = partition(arr,low,high);

            quicksort(arr, low, pvix-1);
            quicksort(arr, pvix+1, high);
            
        }
    }
    public static int partition(int[] arr , int low , int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j = low ; j < high ; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
}
