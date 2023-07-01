class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length-1;
        int mid;
        while(left < right){
            mid = (left + right)/2;
            if(letters[mid] <= target){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        System.gc();
        if (letters[right] > target) return letters[right];
        return letters[0];
        
    }
}
