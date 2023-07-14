class Solution {
    public int totalNQueens(int n) {
       char[][] board = new char[n][n];
       for(int i = 0 ;i < board.length ; i++){
           for(int j = 0 ; j < board.length ; j++){
               board[i][j] = '.';
           }
       } 
       List<List<String>> list = new ArrayList<>();
       helper(board,0,list);
       return list.size();
    }
    public static void helper(char[][] board,int row , List<List<String>> list){
        if(row == board.length){
            list.add(construct(board));
        }

        for(int col = 0 ; col < board.length ; col++){
            if(isSafe(board,row,col)){
                board[row][col] = 'Q';
                helper(board,row+1,list);
                board[row][col] = '.';
            }
        }
    }

    public static List<String> construct(char[][] board){
        List<String> internal = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String row = new String(board[i]);
            internal.add(row);
        }
        return internal;
    }
    public static boolean isSafe(char[][]board , int row , int col){
        for(int i = 0; i < row ;i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        int r = row, c = col;
        while(r >= 0 && c >= 0){
            if(board[r][c] == 'Q'){
                return false;
            }
            --r;
            --c;
        }
    
        r = row; c = col;
        while(r >= 0 && c < board.length){
            if(board[r][c] == 'Q'){
                return false;
            }
            --r;
            ++c;
        }
        
        return true;
    }
}
