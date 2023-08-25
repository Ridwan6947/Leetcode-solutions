import java.util.*;

public class sudokuSolver {

    public static boolean helper(char[][] board , int row , int col){
        for(int i = 0 ; i < board[0].length ; i++){
            for(int j = 0 ; j < board.length ; j++){
                if(isSafe(board,row,j)){
                    board[row][j]
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = {{5,3,0,0,7,0,0,0,0}
        ,{"6",".",".","1","9","5",".",".","."}
        ,{".","9","8",".",".",".",".","6","."}
        ,{"8",".",".",".","6",".",".",".","3"}
        ,{"4",".",".","8",".","3",".",".","1"}
        ,{"7",".",".",".","2",".",".",".","6"}
        ,{".","6",".",".",".",".","2","8","."}
        ,{".",".",".","4","1","9",".",".","5"}
        ,{".",".",".",".","8",".",".","7","9"]}}
        helper(board,0,0);
    }
}
