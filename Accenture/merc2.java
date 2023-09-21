import java.util.*;

public class merc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =2;
        int k = 3;
        int [][] mat = new int[n][n];
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j <mat[0].length ; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++){
                if(mat[i][j] % k != 0 ){
                    mat[i][j] = find(mat[i][j] , k);
                }
            }
        }
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0; j < mat[0].length ; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static int find(int x, int k){
        int largest = 0;
        largest = (x/k) * k;
        return largest;

        
    }
}
