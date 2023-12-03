// package sorting;

public class insertion {
    public static void main(String[] args) {
        int arr[] = {7,8,1,3,2};
        for(int i = 1 ; i < arr.length; i++){
            int curr = arr[i];
            int j = i-1;
            while(j >= 0 && curr < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
            for(int k = 0 ; k < arr.length ; k++){
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }

    }
}
