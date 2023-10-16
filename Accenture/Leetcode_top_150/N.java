import java.util.*;

public class N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        char[][] board = new char[n][n];
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < n ; j++){
                board[i][j] = '.';
            }
        }
        setQueen(board,0);
    }
    public static void setQueen(char[][] board, int row){
        if(row == board.length){
            print(board);
            return;
        }
        for(int col = 0 ; col < board.length ; col++){
            if(isSafe(board,row,col)){
                board[row][col] = 'Q';
                setQueen(board, row+1);
                board[row][col] = '.';
            }
        }
        
    }
    public static void print(char[][] board){
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board.length ; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        
    }
    public static boolean isSafe(char[][] board , int row , int col){
        for(int i = row-1 ; i >= 0 ; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        int r = row;
        int c = col;
        for(int i = r-1 , j = c-1 ; i>=0 && j >=0 ; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        for(int i = r-1 , j = c+1 ; i>=0 && j < board.length ; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
}
