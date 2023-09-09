import java.util.*;

public class ibm13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Let's take LeetCode contest";
        System.out.println(reverse(str));
    }
    public static String reverse(String str){
        StringBuilder sb = new StringBuilder();
        String[] arr = str.split(" ");
        for(String words : arr){
            for(int i = words.length()-1 ; i>= 0 ; i--){
                sb.append(words.charAt(i));
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}
