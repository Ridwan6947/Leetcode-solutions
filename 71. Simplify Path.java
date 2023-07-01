class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String []arr = path.split("/");
        for(String s : arr){
           if(s.equals(".") || s.equals(""))continue;
           else if(s.equals("..")){if(!stack.isEmpty()) stack.pop();}
           else stack.push(s);
        }
        Collections.reverse(stack);
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append("/");
            sb.append(stack.pop());
        }
        if(sb.length()== 0) return "/";
        return   sb.toString();
    }
}
