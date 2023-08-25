import java.util.*;

public class arrays{

    public static void arr(int n ){
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr1[i] = sc.nextInt();

        }
        int arr2[] = {1,2,3};
        
        boolean ans = arr1.equals(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println();
    }
    public static void main(String[] args) {
        //  forming a matrix and printing it

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //  matrix input 
        int [][] matrix = new int[n][n];
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix.length ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // matrix output
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix.length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // function call

        arr(n);
    }
}