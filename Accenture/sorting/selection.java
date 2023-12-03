// package sorting;

public class selection {
    public static void main(String[] args) {
        int arr[] = {7,8,1,3,2};
        for(int i = 0 ; i < arr.length -1; i++){
            int smallest = i;
            for(int j = i + 1 ; j < arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
            for(int j = 0 ; j < arr.length ; j++){
            System.out.print(arr[j]+ " ");
        }
        System.out.println();
        }
    }
}
