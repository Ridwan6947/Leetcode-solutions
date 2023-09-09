import java.util.*;

public class ibm10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "My name is Khan";
        String rev = reverse(str);
        System.out.println(rev);
    }
    public static String reverse(String str){
        StringBuilder sb = new StringBuilder();
        String[] arr = str.split(" ");
        for(int i = arr.length-1 ; i >= 0 ; i--){
            if(arr[i] != ""){
                sb.append(arr[i]);
                sb.append(" ");
            }
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
