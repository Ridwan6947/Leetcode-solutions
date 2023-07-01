class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()){
            return false;
        }
        if(s.length()==0)
            return true;
            
        int x = 0;

        for(int i = 0 ; i < t.length() ; i++){
            if(s.charAt(x) == t.charAt(i)){
                x++;
            }if(x == s.length()){
                return true;
            }
        }
        return false;
        
    }
}
