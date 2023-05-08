class Solution {
    public int diagonalSum(int[][] mat) {
        int sum1 = 0;
        int sum2 = 0;
        int n = mat[0].length;
        int m = mat.length;
        int res = 0;
        for(int i=0; i < mat.length ; i++){
            for(int j = 0 ; j < mat.length ; j++){
                if(i == j){
                    sum1+=mat[i][j];
                }
                if((i+j) == (mat.length-1)){
                    sum2+= mat[i][j];
                }
            }
        }if(m%2==0){
            res = sum1+sum2;
        }else{
             res = sum1+sum2-(mat[m/2][n/2]);
        }
        return res;

        
    }
}
