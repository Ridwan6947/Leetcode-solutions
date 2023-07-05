class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer>rows = new HashSet<>();
        HashSet<Integer>cols = new HashSet<>();
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int r : rows){
            for(int i = 0; i < matrix[0].length; i++){
                matrix[r][i] = 0;
            }
        }
        for(int c : cols){
            for(int j = 0 ; j < matrix.length ; j++){
                matrix[j][c] = 0;
            }
        }
    }
}
