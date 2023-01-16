class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int substring = 0;
        int start = 0;
        int end = 0;
        
        while(end < s.length()){
            char c = s.charAt(end);
            if(!seen.contains(c)){
                seen.add(c);
                int sum = end - start + 1 ;
                substring = Math.max(substring,sum);
                end++;
            }else{
                seen.remove(s.charAt(start++));
            }
        }
        return substring;
    }
    
}
