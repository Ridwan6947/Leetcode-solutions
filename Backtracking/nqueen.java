import java.util.*;

public class nqueen {
    public static boolean isSafe(char[][]board , int row , int col){
        // vertical upward
        for(int i = row-1 ; i >= 0 ; i-- ){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // left diagonal
        int r = row ;
        int c = col;
        for(int i = r-1 , j = c- 1 ; i >=0 && j >= 0 ; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // right diagonal
        for(int i = r-1 , j = c+1 ; i >=0 && j < board.length ; i-- , j++ ){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;

    }
    public static void setqueen(char[][] board , int row){
        if(row == board.length){
            print(board);
            return;
        }
        for(int j = 0 ; j < board.length ; j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                setqueen(board,row+1);
                board[row][j] = '.';
            }
            
        }
    }

    public static void print(char[][] board){
        System.out.println("----------------");
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board.length ; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char [][] board = new char [n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                board[i][j] = '.';
            }
        }
        setqueen(board,0);
    }
}
