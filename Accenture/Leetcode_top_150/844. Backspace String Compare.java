class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        char[] a1 = s.toCharArray();
        char[] a2 = t.toCharArray();

        for(char c : a1){
            if(c != '#'){
                s1.push(c);
            }else if(!s1.isEmpty()){
                // char d = s1.peek();
                s1.pop();
            }
        }
        for(char c : a2){
            if(c != '#'){
                s2.push(c);
            }else if(!s2.isEmpty()){
                // char d = s2.peek();
                s2.pop();
            }
        }
        return s1.equals(s2);

    }
}