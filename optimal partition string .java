class Solution {
    public int partitionString(String s) {
        int count = 1;
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                count++; 
                set = new HashSet();
            }
            set.add(c);
        }

        return count;
    }
}
