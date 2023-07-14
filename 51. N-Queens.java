class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i = 0 ; i < board.length ; i++ ){
            for(int j = 0 ; j < board.length ; j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> result = new ArrayList<>();
        helper(board,0,result);
        return result;
    }
    public static void helper(char[][] board,int row,List<List<String>> result){
        if(row == board.length){
            result.add(construct(board));
            return;
        }
        for(int col = 0 ; col < board.length ; col++){
            if(isSafe(board,row,col)){
                board[row][col] = 'Q';
                helper(board,row+1,result);
                board[row][col] = '.';
            }
            
        }

    }
    public static List<String> construct(char[][] board) {

        List<String> internal = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String row = new String(board[i]);
            internal.add(row);
        }
        return internal;
    }

    public static boolean isSafe(char[][] board , int row , int col){
        //top check
        for(int i = 0 ; i < row ; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        for(int i = row-1 , j = col - 1 ; i >= 0 && j >= 0 ; i-- , j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        for(int i = row-1 , j = col + 1 ; i >= 0 && j < board.length ; i-- , j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
}
