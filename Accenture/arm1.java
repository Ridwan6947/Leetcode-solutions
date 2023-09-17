import java.util.*;

public class arm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] board = new String[3][3];
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                board[i][j] = sc.nextLine();
            }
        }
        int x1 = 1;
        int y1 = 2;
        print(board,x1,y1);
    }
    public static void print(String[][] board , int x1, int y1){
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if(board[x1][y1] == "R"){
                    board[x1][y1] = "G";
                }else{
                    board[x1][y1] = "R";
                }
            }
        }

        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
