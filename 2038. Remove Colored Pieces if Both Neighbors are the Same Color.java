class Solution {
    public boolean winnerOfGame(String colors) {
        int alexScore = 0;
        int bobScore = 0;

        for(int i = 1 ; i < colors.length()-1; i++){
            char prevColor = colors.charAt(i-1);
            char current = colors.charAt(i);
            char nextColor = colors.charAt(i+1);

            if(current == 'A' && prevColor == 'A' && nextColor == 'A'){
                alexScore++;
            }else if(current == 'B' && prevColor == 'B' && nextColor == 'B'){
                bobScore++;
            }
        }
        return alexScore > bobScore;
    }
}