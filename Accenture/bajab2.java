import java.util.*;

public class bajab2 {
    public static void main(String[] args) {
        String str = "Welcome to Coding Ninjas";
        StringBuilder sb = new StringBuilder();
        String [] arr = str.split("\\s+");
        Stack<String> st = new Stack<>();
        for(int i = 0; i < arr.length ; i++){
            st.push(arr[i]);
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }    
}
