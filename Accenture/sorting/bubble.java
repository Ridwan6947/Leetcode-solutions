import java.util.*;

public class bubble{
    public static void main(String[] args) {
        int arr[] = {7,8,1,3,2};
        for(int i = 0 ; i < arr.length - 1 ; i++){
            for(int j = 0 ; j < arr.length - 1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            for(int j = 0 ; j < arr.length ; j++){
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}