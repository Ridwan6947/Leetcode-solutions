import java.util.*;


public class fillarray{
    public static void fill(int[] arr , int i , int val){
        if(i == arr.length){
            print(arr);
            return;
        }
        arr[i] = val;
        fill(arr,i+1,val+1);
        arr[i] = arr[i] - 2;

    }
    public static void print(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int arr[] = new int[5];
       fill(arr,0,1);
       print(arr);
    }
}