class Solution {
    public int[][] generateMatrix(int n) {
        int mat[][] = new int[n][n];
        int rowb=0;
        int rowe = n-1;
        int colb = 0;
        int cole =n-1;
        int counter = 1;

        while(rowb <= rowe && colb <= cole){
            for(int i = colb ; i <= cole ;i++){
                mat[rowb][i]= counter;
                counter++;
            }
            rowb++;
            for(int i = rowb ; i <= rowe ; i++){
                mat[i][cole] = counter;
                counter++;
            }
            cole--;
            if(rowb <= rowe){
                for(int i = cole ; i >= colb ; i--){
                    mat[rowe][i]= counter;
                    counter++;
                }
            }
            rowe--;
            if(colb <= cole){
                for(int i = rowe ; i >= rowb ; i--){
                    mat[i][colb] = counter;
                    counter++;
                }
            }
            colb++;
        }
        return mat;
    }
}
