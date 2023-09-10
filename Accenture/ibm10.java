import java.util.*;

public class ibm10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "My name is Khan";
        reverse(str);
        reverse1(str);
        // System.out.println(rev);
    }
    public static void reverse(String str){
        Stack<String> st = new Stack<>();
        String[] arr = str.split("\\s+");
        for(int i = 0 ; i < arr.length ; i++){
            st.push(arr[i]);
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
    public static void reverse1(String str){
        StringBuilder sb = new StringBuilder();
        
    }
}
