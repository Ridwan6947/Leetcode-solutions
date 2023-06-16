class Solution {
    public boolean checkStraightLine(int[][] a){
        int x1 = a[0][0];
        int y1 = a[0][1];
        int x2 = a[1][0];
        int y2 = a[1][1];

        for(int i = 2 ; i < a.length ; i++){
            int x = a[i][0];
            int y = a[i][1];

            if ((y - y1) * (x - x2) != (y - y2) * (x - x1)) {
                return false;
            }
        }
        return true;
    }
}
